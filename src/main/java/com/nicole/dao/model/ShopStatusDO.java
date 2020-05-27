package com.nicole.dao.model;

import javax.annotation.Generated;

public class ShopStatusDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594345+08:00", comments="Source field: shop_status.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594458+08:00", comments="Source field: shop_status.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594386+08:00", comments="Source field: shop_status.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594422+08:00", comments="Source field: shop_status.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594493+08:00", comments="Source field: shop_status.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594528+08:00", comments="Source field: shop_status.name")
    public void setName(String name) {
        this.name = name;
    }
}