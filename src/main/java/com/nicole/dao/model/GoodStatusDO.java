package com.nicole.dao.model;

import javax.annotation.Generated;

public class GoodStatusDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.60863+08:00", comments="Source field: good_status.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608737+08:00", comments="Source field: good_status.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608669+08:00", comments="Source field: good_status.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608704+08:00", comments="Source field: good_status.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608768+08:00", comments="Source field: good_status.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608801+08:00", comments="Source field: good_status.name")
    public void setName(String name) {
        this.name = name;
    }
}