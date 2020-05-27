package com.nicole.dto;

import java.util.Date;
import java.util.List;

public class OrdersDTO {
    protected Integer id;
    protected String phone;
    protected String userName;
    protected String payType;
    protected String address;
    protected String price;
    protected Integer count;
    protected Date startTime;
    protected Date endTime;
    protected List<String> goodsName;
    protected List<Integer> goodsCount;
    protected Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<String> getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(List<String> goodsName) {
        this.goodsName = goodsName;
    }

    public List<Integer> getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(List<Integer> goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
