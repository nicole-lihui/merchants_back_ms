package com.nicole.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AccountRunningDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62352+08:00", comments="Source Table: account_running")
    public static final AccountRunningDO accountRunningDO = new AccountRunningDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623626+08:00", comments="Source field: account_running.id")
    public static final SqlColumn<Integer> id = accountRunningDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623704+08:00", comments="Source field: account_running.account_id")
    public static final SqlColumn<Integer> accountId = accountRunningDO.accountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623747+08:00", comments="Source field: account_running.bank_id")
    public static final SqlColumn<Integer> bankId = accountRunningDO.bankId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62379+08:00", comments="Source field: account_running.withdrawal")
    public static final SqlColumn<BigDecimal> withdrawal = accountRunningDO.withdrawal;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623837+08:00", comments="Source field: account_running.w_time")
    public static final SqlColumn<Date> wTime = accountRunningDO.wTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623578+08:00", comments="Source Table: account_running")
    public static final class AccountRunningDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> accountId = column("account_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> bankId = column("bank_id", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> withdrawal = column("withdrawal", JDBCType.DECIMAL);

        public final SqlColumn<Date> wTime = column("w_time", JDBCType.TIMESTAMP);

        public AccountRunningDO() {
            super("account_running");
        }
    }
}