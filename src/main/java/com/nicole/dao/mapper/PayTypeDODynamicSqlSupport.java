package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class PayTypeDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.626066+08:00", comments="Source Table: pay_type")
    public static final PayTypeDO payTypeDO = new PayTypeDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.626266+08:00", comments="Source field: pay_type.id")
    public static final SqlColumn<Integer> id = payTypeDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.626328+08:00", comments="Source field: pay_type.name")
    public static final SqlColumn<String> name = payTypeDO.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.626179+08:00", comments="Source Table: pay_type")
    public static final class PayTypeDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public PayTypeDO() {
            super("pay_type");
        }
    }
}