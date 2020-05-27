package com.nicole.dao.model;

import javax.annotation.Generated;

public class BankDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618661+08:00", comments="Source field: bank.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618756+08:00", comments="Source field: bank.bank_name")
    private String bankName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618857+08:00", comments="Source field: bank.first_letter")
    private String firstLetter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618701+08:00", comments="Source field: bank.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618731+08:00", comments="Source field: bank.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.61878+08:00", comments="Source field: bank.bank_name")
    public String getBankName() {
        return bankName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618824+08:00", comments="Source field: bank.bank_name")
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618891+08:00", comments="Source field: bank.first_letter")
    public String getFirstLetter() {
        return firstLetter;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618927+08:00", comments="Source field: bank.first_letter")
    public void setFirstLetter(String firstLetter) {
        this.firstLetter = firstLetter;
    }
}