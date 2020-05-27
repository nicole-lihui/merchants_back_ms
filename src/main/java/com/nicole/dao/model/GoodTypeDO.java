package com.nicole.dao.model;

import javax.annotation.Generated;

public class GoodTypeDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.611551+08:00", comments="Source field: good_type.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.611692+08:00", comments="Source field: good_type.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.611602+08:00", comments="Source field: good_type.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.611649+08:00", comments="Source field: good_type.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.611737+08:00", comments="Source field: good_type.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.611782+08:00", comments="Source field: good_type.name")
    public void setName(String name) {
        this.name = name;
    }
}