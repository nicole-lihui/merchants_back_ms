package com.nicole.dao.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;

public class AccountRunningDO {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623059+08:00", comments="Source field: account_running.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623147+08:00", comments="Source field: account_running.account_id")
    private Integer accountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623237+08:00", comments="Source field: account_running.bank_id")
    private Integer bankId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623308+08:00", comments="Source field: account_running.withdrawal")
    private BigDecimal withdrawal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623377+08:00", comments="Source field: account_running.w_time")
    private Date wTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623092+08:00", comments="Source field: account_running.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623122+08:00", comments="Source field: account_running.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623172+08:00", comments="Source field: account_running.account_id")
    public Integer getAccountId() {
        return accountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623211+08:00", comments="Source field: account_running.account_id")
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623261+08:00", comments="Source field: account_running.bank_id")
    public Integer getBankId() {
        return bankId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623286+08:00", comments="Source field: account_running.bank_id")
    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623333+08:00", comments="Source field: account_running.withdrawal")
    public BigDecimal getWithdrawal() {
        return withdrawal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623357+08:00", comments="Source field: account_running.withdrawal")
    public void setWithdrawal(BigDecimal withdrawal) {
        this.withdrawal = withdrawal;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623408+08:00", comments="Source field: account_running.w_time")
    public Date getwTime() {
        return wTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623445+08:00", comments="Source field: account_running.w_time")
    public void setwTime(Date wTime) {
        this.wTime = wTime;
    }
}