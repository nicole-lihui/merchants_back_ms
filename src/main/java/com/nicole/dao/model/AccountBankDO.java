package com.nicole.dao.model;

import javax.annotation.Generated;

public class AccountBankDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620823+08:00", comments="Source field: account_bank.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620912+08:00", comments="Source field: account_bank.account_id")
    private Integer accountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620984+08:00", comments="Source field: account_bank.bank_id")
    private Integer bankId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620859+08:00", comments="Source field: account_bank.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620888+08:00", comments="Source field: account_bank.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620937+08:00", comments="Source field: account_bank.account_id")
    public Integer getAccountId() {
        return accountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620962+08:00", comments="Source field: account_bank.account_id")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621008+08:00", comments="Source field: account_bank.bank_id")
    public Integer getBankId() {
        return bankId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621031+08:00", comments="Source field: account_bank.bank_id")
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }
}