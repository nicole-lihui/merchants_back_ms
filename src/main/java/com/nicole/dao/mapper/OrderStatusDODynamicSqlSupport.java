package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderStatusDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601555+08:00", comments="Source Table: order_status")
    public static final OrderStatusDO orderStatusDO = new OrderStatusDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601689+08:00", comments="Source field: order_status.id")
    public static final SqlColumn<Integer> id = orderStatusDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601748+08:00", comments="Source field: order_status.name")
    public static final SqlColumn<String> name = orderStatusDO.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601624+08:00", comments="Source Table: order_status")
    public static final class OrderStatusDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public OrderStatusDO() {
            super("order_status");
        }
    }
}