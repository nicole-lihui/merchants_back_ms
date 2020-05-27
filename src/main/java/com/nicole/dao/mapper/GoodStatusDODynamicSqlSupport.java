package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GoodStatusDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608877+08:00", comments="Source Table: good_status")
    public static final GoodStatusDO goodStatusDO = new GoodStatusDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.609006+08:00", comments="Source field: good_status.id")
    public static final SqlColumn<Integer> id = goodStatusDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.609058+08:00", comments="Source field: good_status.name")
    public static final SqlColumn<String> name = goodStatusDO.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608942+08:00", comments="Source Table: good_status")
    public static final class GoodStatusDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public GoodStatusDO() {
            super("good_status");
        }
    }
}