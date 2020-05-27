package com.nicole.dao.mapper;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class GoodDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605427+08:00", comments="Source Table: goods")
    public static final GoodDO goodDO = new GoodDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605592+08:00", comments="Source field: goods.id")
    public static final SqlColumn<Integer> id = goodDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605645+08:00", comments="Source field: goods.icon")
    public static final SqlColumn<String> icon = goodDO.icon;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605691+08:00", comments="Source field: goods.title")
    public static final SqlColumn<String> title = goodDO.title;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605738+08:00", comments="Source field: goods.shop_id")
    public static final SqlColumn<Integer> shopId = goodDO.shopId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605808+08:00", comments="Source field: goods.type")
    public static final SqlColumn<Integer> type = goodDO.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605853+08:00", comments="Source field: goods.status")
    public static final SqlColumn<Integer> status = goodDO.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605899+08:00", comments="Source field: goods.count")
    public static final SqlColumn<Integer> count = goodDO.count;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605947+08:00", comments="Source field: goods.price")
    public static final SqlColumn<BigDecimal> price = goodDO.price;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605995+08:00", comments="Source field: goods.start_time")
    public static final SqlColumn<Date> startTime = goodDO.startTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.605505+08:00", comments="Source Table: goods")
    public static final class GoodDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> icon = column("icon", JDBCType.VARCHAR);

        public final SqlColumn<String> title = column("title", JDBCType.VARCHAR);

        public final SqlColumn<Integer> shopId = column("shop_id", JDBCType.INTEGER);

        public final SqlColumn<Integer> type = column("type", JDBCType.INTEGER);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<Integer> count = column("count", JDBCType.INTEGER);

        public final SqlColumn<BigDecimal> price = column("price", JDBCType.DECIMAL);

        public final SqlColumn<Date> startTime = column("start_time", JDBCType.TIMESTAMP);

        public GoodDO() {
            super("goods");
        }
    }
}