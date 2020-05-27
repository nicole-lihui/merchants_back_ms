package com.nicole.service;

import com.nicole.dao.mapper.GoodMapper;
import com.nicole.dao.mapper.OrderGoodMapper;
import com.nicole.dao.mapper.OrderMapper;
import com.nicole.dao.model.GoodDO;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.nicole.dao.mapper.OrderDODynamicSqlSupport.*;
import static com.nicole.dao.mapper.OrderGoodDODynamicSqlSupport.*;
import static com.nicole.dao.mapper.GoodDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class OrderGoodService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderGoodMapper orderGoodMapper;

    @Autowired
    private GoodMapper goodMapper;

    public void selectMany() {
        SelectStatementProvider selectStatement = select(goodDO.title, goodDO.price)
                .from(orderDO, "order")
                .join(orderGoodDO, "og").on(orderDO.id, equalTo(orderGoodDO.orderId))
                .join(goodDO, "good").on(goodDO.id, equalTo(orderGoodDO.goodId))
                .build()
                .render(RenderingStrategies.MYBATIS3);

        List<GoodDO> gl = goodMapper.selectMany(selectStatement);
    }
}
