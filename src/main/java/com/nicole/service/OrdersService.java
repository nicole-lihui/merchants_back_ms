package com.nicole.service;

import com.nicole.dao.mapper.OrderGoodMapper;
import com.nicole.dao.mapper.OrderMapper;
import com.nicole.dao.mapper.PayTypeMapper;
import com.nicole.dao.model.OrderDO;
import com.nicole.dao.model.OrderGoodDO;
import com.nicole.dao.model.PayTypeDO;
import com.nicole.dto.OrdersDTO;
import com.nicole.utils.DataUtil;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static com.nicole.dao.mapper.OrderDODynamicSqlSupport.*;
import static com.nicole.dao.mapper.PayTypeDODynamicSqlSupport.*;
import static com.nicole.dao.mapper.OrderGoodDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Service
public class OrdersService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private PayTypeMapper payTypeMapper;

    @Autowired
    private OrderGoodMapper orderGoodMapper;

    @Autowired
    private GoodsService goodsService;

    public OrdersDTO selectOne(Integer oid) {
        Optional<OrderDO> op = orderMapper.selectOne(c -> c.where(orderDO.id, isEqualTo(oid)));
        OrderDO one = null;

        if (op.isPresent())
            one = op.get();
        else
            return null;

        OrdersDTO ordersVO = new OrdersDTO();
        ordersVO.setId(one.getId());
        ordersVO.setAddress(one.getAddress());
        ordersVO.setPhone(one.getPhone());
        ordersVO.setUserName(one.getUserName());
        ordersVO.setStatus(one.getStatusId());

//            获取支付类型
        SelectStatementProvider payTypeSql = select(payTypeDO.allColumns())
                .from(payTypeDO)
                .where(payTypeDO.id, isEqualTo(one.getId()))
                .build()
                .render(RenderingStrategies.MYBATIS3);

        Optional<PayTypeDO> payOp = payTypeMapper.selectOne(payTypeSql);

        String payName = null;
        if (payOp.isPresent())
            payName = payOp.get().getName();
        ordersVO.setPayType(payName);

//            获取订单商品列表
        SelectStatementProvider odGoodSql = select(orderGoodDO.allColumns())
                .from(orderGoodDO)
                .where(orderGoodDO.orderId, isEqualTo(one.getId()))
                .build()
                .render(RenderingStrategies.MYBATIS3);

        List<OrderGoodDO> odGoodList = orderGoodMapper.selectMany(odGoodSql);

        LinkedList<String> nl = null;
        LinkedList<Integer> cl = null;
        Integer count = 0;
        BigDecimal price = new BigDecimal("0.0");

        if (odGoodList != null) {
            nl = new LinkedList<>();
            cl = new LinkedList<>();
            for (OrderGoodDO oGOne : odGoodList) {
                String gName = goodsService.selectOne(oGOne.getGoodId()).getTitle();
                nl.add(gName);
                cl.add(oGOne.getCount());
                count += oGOne.getCount();
                price = oGOne.getPrice().add(price);
            }
        }
        ordersVO.setGoodsName(nl);
        ordersVO.setGoodsCount(cl);

//            计算总价和总数
        ordersVO.setCount(count);
        ordersVO.setPrice(price.toString());

        return ordersVO;
    }

    public List<OrdersDTO> selectMany(Integer oshopId, Integer ostatus) {

        SelectStatementProvider selectStatement = select(orderDO.allColumns())
                .from(orderDO)
                .where(shopId, isEqualTo(oshopId))
                .and(statusId, isEqualTo(ostatus))
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<OrderDO> ordersDO = orderMapper.selectMany(selectStatement);

        if (ordersDO == null)
            return null;

        List<OrdersDTO> ol = new LinkedList<>();

        for (OrderDO one: ordersDO) {
            OrdersDTO ordersVO = new OrdersDTO();
            ordersVO.setId(one.getId());
            ordersVO.setAddress(one.getAddress());
            ordersVO.setPhone(one.getPhone());
            ordersVO.setUserName(one.getUserName());
            ordersVO.setStatus(one.getStatusId());

//            获取支付类型
            SelectStatementProvider payTypeSql = select(payTypeDO.allColumns())
                    .from(payTypeDO)
                    .where(payTypeDO.id, isEqualTo(one.getId()))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);

            Optional<PayTypeDO> payOp = payTypeMapper.selectOne(payTypeSql);

            String payName = null;
            if (payOp.isPresent())
                payName = payOp.get().getName();
            ordersVO.setPayType(payName);

//            获取订单商品列表
            SelectStatementProvider odGoodSql = select(orderGoodDO.allColumns())
                    .from(orderGoodDO)
                    .where(orderGoodDO.orderId, isEqualTo(one.getId()))
                    .build()
                    .render(RenderingStrategies.MYBATIS3);

            List<OrderGoodDO> odGoodList = orderGoodMapper.selectMany(odGoodSql);

            LinkedList<String> nl = null;
            LinkedList<Integer> cl = null;
            Integer count = 0;
            BigDecimal price = new BigDecimal("0.0");

            if (odGoodList != null) {
                nl = new LinkedList<>();
                cl = new LinkedList<>();
                for (OrderGoodDO oGOne : odGoodList) {
                    String gName = goodsService.selectOne(oGOne.getGoodId()).getTitle();
                    nl.add(gName);
                    cl.add(oGOne.getCount());
                    count += oGOne.getCount();
                    price = oGOne.getPrice().add(price);
                }
            }
            ordersVO.setGoodsName(nl);
            ordersVO.setGoodsCount(cl);

//            计算总价和总数
            ordersVO.setCount(count);
            ordersVO.setPrice(price.toString());

            ol.add(ordersVO);
        }

        return ol;
    }

//    insert
    public int insertOrderf(OrderDO order) {
        if (order == null)
            return 0;
        int row = 0;
        try {
            row = orderMapper.insert(order);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return row;
    }

//    update
    public int updateOrderStatus(Integer oid, Integer ostatus) {
        if (oid == null)
            return 0;

        int row = 0;

        try {
            row = orderMapper.update(c -> c.set(statusId).equalTo(ostatus));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

        return row;
    }

//    delete
    public int deleteOrder(Integer oid) {
        if (oid == null)
            return 0;
        int row = 0;
        try {
            row = orderMapper.delete(c -> c.where(orderDO.id, isEqualTo(oid)));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

        return row;
    }
}

