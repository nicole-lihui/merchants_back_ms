package com.nicole.dao.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class LoginDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.567645+08:00", comments="Source Table: login")
    public static final LoginDO loginDO = new LoginDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.5681+08:00", comments="Source field: login.id")
    public static final SqlColumn<Integer> id = loginDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.568533+08:00", comments="Source field: login.phone")
    public static final SqlColumn<String> phone = loginDO.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.568614+08:00", comments="Source field: login.password")
    public static final SqlColumn<String> password = loginDO.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.568697+08:00", comments="Source field: login.register_time")
    public static final SqlColumn<Date> registerTime = loginDO.registerTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.567939+08:00", comments="Source Table: login")
    public static final class LoginDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> password = column("password", JDBCType.VARCHAR);

        public final SqlColumn<Date> registerTime = column("register_time", JDBCType.TIMESTAMP);

        public LoginDO() {
            super("login");
        }
    }
}