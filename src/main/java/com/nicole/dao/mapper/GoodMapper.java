package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.GoodDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.GoodDO;
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
public interface GoodMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.60734+08:00", comments="Source Table: goods")
    BasicColumn[] selectList = BasicColumn.columnList(id, icon, title, shopId, type, status, count, price, startTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606047+08:00", comments="Source Table: goods")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606115+08:00", comments="Source Table: goods")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606163+08:00", comments="Source Table: goods")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<GoodDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606214+08:00", comments="Source Table: goods")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<GoodDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606266+08:00", comments="Source Table: goods")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("GoodDOResult")
    Optional<GoodDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606332+08:00", comments="Source Table: goods")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="GoodDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="icon", property="icon", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="count", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<GoodDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606444+08:00", comments="Source Table: goods")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606501+08:00", comments="Source Table: goods")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, goodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606547+08:00", comments="Source Table: goods")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, goodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606592+08:00", comments="Source Table: goods")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606649+08:00", comments="Source Table: goods")
    default int insert(GoodDO record) {
        return MyBatis3Utils.insert(this::insert, record, goodDO, c ->
            c.map(id).toProperty("id")
            .map(icon).toProperty("icon")
            .map(title).toProperty("title")
            .map(shopId).toProperty("shopId")
            .map(type).toProperty("type")
            .map(status).toProperty("status")
            .map(count).toProperty("count")
            .map(price).toProperty("price")
            .map(startTime).toProperty("startTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.606864+08:00", comments="Source Table: goods")
    default int insertMultiple(Collection<GoodDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, goodDO, c ->
            c.map(id).toProperty("id")
            .map(icon).toProperty("icon")
            .map(title).toProperty("title")
            .map(shopId).toProperty("shopId")
            .map(type).toProperty("type")
            .map(status).toProperty("status")
            .map(count).toProperty("count")
            .map(price).toProperty("price")
            .map(startTime).toProperty("startTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.607011+08:00", comments="Source Table: goods")
    default int insertSelective(GoodDO record) {
        return MyBatis3Utils.insert(this::insert, record, goodDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(icon).toPropertyWhenPresent("icon", record::getIcon)
            .map(title).toPropertyWhenPresent("title", record::getTitle)
            .map(shopId).toPropertyWhenPresent("shopId", record::getShopId)
            .map(type).toPropertyWhenPresent("type", record::getType)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(count).toPropertyWhenPresent("count", record::getCount)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.607423+08:00", comments="Source Table: goods")
    default Optional<GoodDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, goodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.607509+08:00", comments="Source Table: goods")
    default List<GoodDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, goodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.607583+08:00", comments="Source Table: goods")
    default List<GoodDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, goodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.607649+08:00", comments="Source Table: goods")
    default Optional<GoodDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.607752+08:00", comments="Source Table: goods")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, goodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.607873+08:00", comments="Source Table: goods")
    static UpdateDSL<UpdateModel> updateAllColumns(GoodDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(icon).equalTo(record::getIcon)
                .set(title).equalTo(record::getTitle)
                .set(shopId).equalTo(record::getShopId)
                .set(type).equalTo(record::getType)
                .set(status).equalTo(record::getStatus)
                .set(count).equalTo(record::getCount)
                .set(price).equalTo(record::getPrice)
                .set(startTime).equalTo(record::getStartTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608102+08:00", comments="Source Table: goods")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(GoodDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(icon).equalToWhenPresent(record::getIcon)
                .set(title).equalToWhenPresent(record::getTitle)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(type).equalToWhenPresent(record::getType)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(count).equalToWhenPresent(record::getCount)
                .set(price).equalToWhenPresent(record::getPrice)
                .set(startTime).equalToWhenPresent(record::getStartTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608268+08:00", comments="Source Table: goods")
    default int updateByPrimaryKey(GoodDO record) {
        return update(c ->
            c.set(icon).equalTo(record::getIcon)
            .set(title).equalTo(record::getTitle)
            .set(shopId).equalTo(record::getShopId)
            .set(type).equalTo(record::getType)
            .set(status).equalTo(record::getStatus)
            .set(count).equalTo(record::getCount)
            .set(price).equalTo(record::getPrice)
            .set(startTime).equalTo(record::getStartTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.608389+08:00", comments="Source Table: goods")
    default int updateByPrimaryKeySelective(GoodDO record) {
        return update(c ->
            c.set(icon).equalToWhenPresent(record::getIcon)
            .set(title).equalToWhenPresent(record::getTitle)
            .set(shopId).equalToWhenPresent(record::getShopId)
            .set(type).equalToWhenPresent(record::getType)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(count).equalToWhenPresent(record::getCount)
            .set(price).equalToWhenPresent(record::getPrice)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}