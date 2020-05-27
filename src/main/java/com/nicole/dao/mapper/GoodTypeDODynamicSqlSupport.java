package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GoodTypeDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.611886+08:00", comments="Source Table: good_type")
    public static final GoodTypeDO goodTypeDO = new GoodTypeDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.612025+08:00", comments="Source field: good_type.id")
    public static final SqlColumn<Integer> id = goodTypeDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.612075+08:00", comments="Source field: good_type.name")
    public static final SqlColumn<String> name = goodTypeDO.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.611951+08:00", comments="Source Table: good_type")
    public static final class GoodTypeDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public GoodTypeDO() {
            super("good_type");
        }
    }
}