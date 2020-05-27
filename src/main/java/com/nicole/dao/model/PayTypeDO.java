package com.nicole.dao.model;

import javax.annotation.Generated;

public class PayTypeDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625836+08:00", comments="Source field: pay_type.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625933+08:00", comments="Source field: pay_type.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625878+08:00", comments="Source field: pay_type.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62591+08:00", comments="Source field: pay_type.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625957+08:00", comments="Source field: pay_type.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625984+08:00", comments="Source field: pay_type.name")
    public void setName(String name) {
        this.name = name;
    }
}