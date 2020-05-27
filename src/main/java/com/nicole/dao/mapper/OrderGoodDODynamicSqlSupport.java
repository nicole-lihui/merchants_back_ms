package com.nicole.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class OrderGoodDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615316+08:00", comments="Source Table: order_good")
    public static final OrderGoodDO orderGoodDO = new OrderGoodDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.61553+08:00", comments="Source field: order_good.id")
    public static final SqlColumn<Integer> id = orderGoodDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615631+08:00", comments="Source field: order_good.order_id")
    public static final SqlColumn<Integer> orderId = orderGoodDO.orderId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615706+08:00", comments="Source field: order_good.good_id")
    public static final SqlColumn<Integer> goodId = orderGoodDO.goodId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615768+08:00", comments="Source field: order_good.count")
    public static final SqlColumn<Integer> count = orderGoodDO.count;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615866+08:00", comments="Source field: order_good.price")
    public static final SqlColumn<BigDecimal> price = orderGoodDO.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615388+08:00", comments="Source Table: order_good")
    public static final class OrderGoodDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> orderId = column("order_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> goodId = column("good_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> count = column("count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public OrderGoodDO() {
            super("order_good");
        }
    }
}