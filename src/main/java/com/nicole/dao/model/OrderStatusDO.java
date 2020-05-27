package com.nicole.dao.model;

import javax.annotation.Generated;

public class OrderStatusDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601306+08:00", comments="Source field: order_status.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601413+08:00", comments="Source field: order_status.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601344+08:00", comments="Source field: order_status.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.60138+08:00", comments="Source field: order_status.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601446+08:00", comments="Source field: order_status.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.60148+08:00", comments="Source field: order_status.name")
    public void setName(String name) {
        this.name = name;
    }
}