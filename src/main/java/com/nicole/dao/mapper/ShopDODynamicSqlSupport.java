package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ShopDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.591766+08:00", comments="Source Table: shop")
    public static final ShopDO shopDO = new ShopDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.591928+08:00", comments="Source field: shop.id")
    public static final SqlColumn<Integer> id = shopDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.591984+08:00", comments="Source field: shop.shop_name")
    public static final SqlColumn<String> shopName = shopDO.shopName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592038+08:00", comments="Source field: shop.shop_logo")
    public static final SqlColumn<String> shopLogo = shopDO.shopLogo;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592091+08:00", comments="Source field: shop.address")
    public static final SqlColumn<String> address = shopDO.address;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592144+08:00", comments="Source field: shop.phone")
    public static final SqlColumn<String> phone = shopDO.phone;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592193+08:00", comments="Source field: shop.status")
    public static final SqlColumn<Boolean> status = shopDO.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592268+08:00", comments="Source field: shop.introduction")
    public static final SqlColumn<String> introduction = shopDO.introduction;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.591849+08:00", comments="Source Table: shop")
    public static final class ShopDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> shopName = column("shop_name", JDBCType.VARCHAR);

        public final SqlColumn<String> shopLogo = column("shop_logo", JDBCType.VARCHAR);

        public final SqlColumn<String> address = column("address", JDBCType.VARCHAR);

        public final SqlColumn<String> phone = column("phone", JDBCType.VARCHAR);

        public final SqlColumn<Boolean> status = column("status", JDBCType.BOOLEAN);

        public final SqlColumn<String> introduction = column("introduction", JDBCType.VARCHAR);

        public ShopDO() {
            super("shop");
        }
    }
}