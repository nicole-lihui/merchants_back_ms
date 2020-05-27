package com.nicole.dao.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598634+08:00", comments="Source Table: orders")
    public static final OrderDO orderDO = new OrderDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598839+08:00", comments="Source field: orders.id")
    public static final SqlColumn<Integer> id = orderDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598897+08:00", comments="Source field: orders.shop_id")
    public static final SqlColumn<Integer> shopId = orderDO.shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598947+08:00", comments="Source field: orders.phone")
    public static final SqlColumn<String> phone = orderDO.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598998+08:00", comments="Source field: orders.user_name")
    public static final SqlColumn<String> userName = orderDO.userName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599051+08:00", comments="Source field: orders.payType")
    public static final SqlColumn<Integer> paytype = orderDO.paytype;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.5991+08:00", comments="Source field: orders.address")
    public static final SqlColumn<String> address = orderDO.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.59915+08:00", comments="Source field: orders.status_id")
    public static final SqlColumn<Integer> statusId = orderDO.statusId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599227+08:00", comments="Source field: orders.start_time")
    public static final SqlColumn<Date> startTime = orderDO.startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599304+08:00", comments="Source field: orders.end_time")
    public static final SqlColumn<Date> endTime = orderDO.endTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.598753+08:00", comments="Source Table: orders")
    public static final class OrderDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> shopId = column("shop_id", JDBCType.INTEGER);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<String> userName = column("user_name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> paytype = column("payType", JDBCType.INTEGER);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<Integer> statusId = column("status_id", JDBCType.INTEGER);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> endTime = column("end_time", JDBCType.TIMESTAMP);

        public OrderDO() {
            super("orders");
        }
    }
}