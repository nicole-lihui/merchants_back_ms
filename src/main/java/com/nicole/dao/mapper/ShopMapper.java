package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.ShopDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.ShopDO;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ShopMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.59342+08:00", comments="Source Table: shop")
    BasicColumn[] selectList = BasicColumn.columnList(id, shopName, shopLogo, address, phone, status, introduction);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592323+08:00", comments="Source Table: shop")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592383+08:00", comments="Source Table: shop")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592435+08:00", comments="Source Table: shop")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ShopDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592503+08:00", comments="Source Table: shop")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ShopDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592562+08:00", comments="Source Table: shop")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ShopDOResult")
    Optional<ShopDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592624+08:00", comments="Source Table: shop")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ShopDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="shop_name", property="shopName", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_logo", property="shopLogo", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.BOOLEAN),
        @Result(column="introduction", property="introduction", jdbcType=JdbcType.VARCHAR)
    })
    List<ShopDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592733+08:00", comments="Source Table: shop")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592783+08:00", comments="Source Table: shop")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, shopDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592835+08:00", comments="Source Table: shop")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, shopDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592883+08:00", comments="Source Table: shop")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.592942+08:00", comments="Source Table: shop")
    default int insert(ShopDO record) {
        return MyBatis3Utils.insert(this::insert, record, shopDO, c ->
            c.map(id).toProperty("id")
            .map(shopName).toProperty("shopName")
            .map(shopLogo).toProperty("shopLogo")
            .map(address).toProperty("address")
            .map(phone).toProperty("phone")
            .map(status).toProperty("status")
            .map(introduction).toProperty("introduction")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.59303+08:00", comments="Source Table: shop")
    default int insertMultiple(Collection<ShopDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, shopDO, c ->
            c.map(id).toProperty("id")
            .map(shopName).toProperty("shopName")
            .map(shopLogo).toProperty("shopLogo")
            .map(address).toProperty("address")
            .map(phone).toProperty("phone")
            .map(status).toProperty("status")
            .map(introduction).toProperty("introduction")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.593155+08:00", comments="Source Table: shop")
    default int insertSelective(ShopDO record) {
        return MyBatis3Utils.insert(this::insert, record, shopDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(shopName).toPropertyWhenPresent("shopName", record::getShopName)
            .map(shopLogo).toPropertyWhenPresent("shopLogo", record::getShopLogo)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(introduction).toPropertyWhenPresent("introduction", record::getIntroduction)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.59348+08:00", comments="Source Table: shop")
    default Optional<ShopDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, shopDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.593538+08:00", comments="Source Table: shop")
    default List<ShopDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, shopDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.593592+08:00", comments="Source Table: shop")
    default List<ShopDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, shopDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.593644+08:00", comments="Source Table: shop")
    default Optional<ShopDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.593697+08:00", comments="Source Table: shop")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, shopDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.59375+08:00", comments="Source Table: shop")
    static UpdateDSL<UpdateModel> updateAllColumns(ShopDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(shopName).equalTo(record::getShopName)
                .set(shopLogo).equalTo(record::getShopLogo)
                .set(address).equalTo(record::getAddress)
                .set(phone).equalTo(record::getPhone)
                .set(status).equalTo(record::getStatus)
                .set(introduction).equalTo(record::getIntroduction);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.593849+08:00", comments="Source Table: shop")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ShopDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(shopName).equalToWhenPresent(record::getShopName)
                .set(shopLogo).equalToWhenPresent(record::getShopLogo)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(introduction).equalToWhenPresent(record::getIntroduction);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.593972+08:00", comments="Source Table: shop")
    default int updateByPrimaryKey(ShopDO record) {
        return update(c ->
            c.set(shopName).equalTo(record::getShopName)
            .set(shopLogo).equalTo(record::getShopLogo)
            .set(address).equalTo(record::getAddress)
            .set(phone).equalTo(record::getPhone)
            .set(status).equalTo(record::getStatus)
            .set(introduction).equalTo(record::getIntroduction)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.594085+08:00", comments="Source Table: shop")
    default int updateByPrimaryKeySelective(ShopDO record) {
        return update(c ->
            c.set(shopName).equalToWhenPresent(record::getShopName)
            .set(shopLogo).equalToWhenPresent(record::getShopLogo)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(introduction).equalToWhenPresent(record::getIntroduction)
            .where(id, isEqualTo(record::getId))
        );
    }
}