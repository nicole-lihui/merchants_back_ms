package com.nicole.dao.model;

import java.math.BigDecimal;
import javax.annotation.Generated;

public class OrderGoodDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.61473+08:00", comments="Source field: order_good.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.614855+08:00", comments="Source field: order_good.order_id")
    private Integer orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.614944+08:00", comments="Source field: order_good.good_id")
    private Integer goodId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615036+08:00", comments="Source field: order_good.count")
    private Integer count;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615121+08:00", comments="Source field: order_good.price")
    private BigDecimal price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.614781+08:00", comments="Source field: order_good.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.614827+08:00", comments="Source field: order_good.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.614883+08:00", comments="Source field: order_good.order_id")
    public Integer getOrderId() {
        return orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.614915+08:00", comments="Source field: order_good.order_id")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.614974+08:00", comments="Source field: order_good.good_id")
    public Integer getGoodId() {
        return goodId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615005+08:00", comments="Source field: order_good.good_id")
    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615073+08:00", comments="Source field: order_good.count")
    public Integer getCount() {
        return count;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615098+08:00", comments="Source field: order_good.count")
    public void setCount(Integer count) {
        this.count = count;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615148+08:00", comments="Source field: order_good.price")
    public BigDecimal getPrice() {
        return price;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615174+08:00", comments="Source field: order_good.price")
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}