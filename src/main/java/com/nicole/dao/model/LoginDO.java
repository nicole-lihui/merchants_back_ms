package com.nicole.dao.model;

import java.util.Date;
import javax.annotation.Generated;

public class LoginDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.56058+08:00", comments="Source field: login.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.563716+08:00", comments="Source field: login.phone")
    private String phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.563905+08:00", comments="Source field: login.password")
    private String password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.564061+08:00", comments="Source field: login.register_time")
    private Date registerTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.563294+08:00", comments="Source field: login.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.563646+08:00", comments="Source field: login.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.563773+08:00", comments="Source field: login.phone")
    public String getPhone() {
        return phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.563852+08:00", comments="Source field: login.phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.563958+08:00", comments="Source field: login.password")
    public String getPassword() {
        return password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.564011+08:00", comments="Source field: login.password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.56413+08:00", comments="Source field: login.register_time")
    public Date getRegisterTime() {
        return registerTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.564185+08:00", comments="Source field: login.register_time")
    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}