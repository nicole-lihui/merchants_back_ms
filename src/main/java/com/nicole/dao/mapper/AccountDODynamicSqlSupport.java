package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class AccountDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.587421+08:00", comments="Source Table: account")
    public static final AccountDO accountDO = new AccountDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.587694+08:00", comments="Source field: account.id")
    public static final SqlColumn<Integer> id = accountDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.587805+08:00", comments="Source field: account.phone")
    public static final SqlColumn<String> phone = accountDO.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.588114+08:00", comments="Source field: account.shop_id")
    public static final SqlColumn<Integer> shopId = accountDO.shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.588314+08:00", comments="Source field: account.user_name")
    public static final SqlColumn<String> userName = accountDO.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.588375+08:00", comments="Source field: account.money")
    public static final SqlColumn<Double> money = accountDO.money;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.587515+08:00", comments="Source Table: account")
    public static final class AccountDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<Integer> shopId = column("shop_id", JDBCType.INTEGER);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public final SqlColumn<Double> money = column("money", JDBCType.DECIMAL);

        public AccountDO() {
            super("account");
        }
    }
}