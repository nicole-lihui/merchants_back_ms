package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ShopStatusDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594602+08:00", comments="Source Table: shop_status")
    public static final ShopStatusDO shopStatusDO = new ShopStatusDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594856+08:00", comments="Source field: shop_status.id")
    public static final SqlColumn<Integer> id = shopStatusDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594958+08:00", comments="Source field: shop_status.name")
    public static final SqlColumn<String> name = shopStatusDO.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594734+08:00", comments="Source Table: shop_status")
    public static final class ShopStatusDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public ShopStatusDO() {
            super("shop_status");
        }
    }
}