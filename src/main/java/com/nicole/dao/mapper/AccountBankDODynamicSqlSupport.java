package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AccountBankDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621095+08:00", comments="Source Table: account_bank")
    public static final AccountBankDO accountBankDO = new AccountBankDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621194+08:00", comments="Source field: account_bank.id")
    public static final SqlColumn<Integer> id = accountBankDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621244+08:00", comments="Source field: account_bank.account_id")
    public static final SqlColumn<Integer> accountId = accountBankDO.accountId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621299+08:00", comments="Source field: account_bank.bank_id")
    public static final SqlColumn<Integer> bankId = accountBankDO.bankId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621147+08:00", comments="Source Table: account_bank")
    public static final class AccountBankDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> accountId = column("account_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> bankId = column("bank_id", JDBCType.INTEGER);

        public AccountBankDO() {
            super("account_bank");
        }
    }
}