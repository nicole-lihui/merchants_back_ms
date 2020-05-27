package com.nicole.dao.model;

import java.util.Date;
import javax.annotation.Generated;

public class OrderDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597547+08:00", comments="Source field: orders.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597688+08:00", comments="Source field: orders.shop_id")
    private Integer shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597803+08:00", comments="Source field: orders.phone")
    private String phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597919+08:00", comments="Source field: orders.user_name")
    private String userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598037+08:00", comments="Source field: orders.payType")
    private Integer paytype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.59815+08:00", comments="Source field: orders.address")
    private String address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598251+08:00", comments="Source field: orders.status_id")
    private Integer statusId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598358+08:00", comments="Source field: orders.start_time")
    private Date startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598464+08:00", comments="Source field: orders.end_time")
    private Date endTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597601+08:00", comments="Source field: orders.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597654+08:00", comments="Source field: orders.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597723+08:00", comments="Source field: orders.shop_id")
    public Integer getShopId() {
        return shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597769+08:00", comments="Source field: orders.shop_id")
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597839+08:00", comments="Source field: orders.phone")
    public String getPhone() {
        return phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597887+08:00", comments="Source field: orders.phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597953+08:00", comments="Source field: orders.user_name")
    public String getUserName() {
        return userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.597989+08:00", comments="Source field: orders.user_name")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598073+08:00", comments="Source field: orders.payType")
    public Integer getPaytype() {
        return paytype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598108+08:00", comments="Source field: orders.payType")
    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598185+08:00", comments="Source field: orders.address")
    public String getAddress() {
        return address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598221+08:00", comments="Source field: orders.address")
    public void setAddress(String address) {
        this.address = address;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598288+08:00", comments="Source field: orders.status_id")
    public Integer getStatusId() {
        return statusId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598326+08:00", comments="Source field: orders.status_id")
    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598395+08:00", comments="Source field: orders.start_time")
    public Date getStartTime() {
        return startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598431+08:00", comments="Source field: orders.start_time")
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598499+08:00", comments="Source field: orders.end_time")
    public Date getEndTime() {
        return endTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598535+08:00", comments="Source field: orders.end_time")
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}