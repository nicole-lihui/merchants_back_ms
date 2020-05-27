package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.OrderGoodDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.OrderGoodDO;
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
public interface OrderGoodMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617304+08:00", comments="Source Table: order_good")
    BasicColumn[] selectList = BasicColumn.columnList(id, orderId, goodId, count, price);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.615914+08:00", comments="Source Table: order_good")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616003+08:00", comments="Source Table: order_good")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616062+08:00", comments="Source Table: order_good")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OrderGoodDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616106+08:00", comments="Source Table: order_good")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OrderGoodDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616162+08:00", comments="Source Table: order_good")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OrderGoodDOResult")
    Optional<OrderGoodDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616217+08:00", comments="Source Table: order_good")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OrderGoodDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="order_id", property="orderId", jdbcType=JdbcType.INTEGER),
        @Result(column="good_id", property="goodId", jdbcType=JdbcType.INTEGER),
        @Result(column="count", property="count", jdbcType=JdbcType.INTEGER),
        @Result(column="price", property="price", jdbcType=JdbcType.DECIMAL)
    })
    List<OrderGoodDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616355+08:00", comments="Source Table: order_good")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616439+08:00", comments="Source Table: order_good")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, orderGoodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616509+08:00", comments="Source Table: order_good")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, orderGoodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.61657+08:00", comments="Source Table: order_good")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616618+08:00", comments="Source Table: order_good")
    default int insert(OrderGoodDO record) {
        return MyBatis3Utils.insert(this::insert, record, orderGoodDO, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(goodId).toProperty("goodId")
            .map(count).toProperty("count")
            .map(price).toProperty("price")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.616757+08:00", comments="Source Table: order_good")
    default int insertMultiple(Collection<OrderGoodDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, orderGoodDO, c ->
            c.map(id).toProperty("id")
            .map(orderId).toProperty("orderId")
            .map(goodId).toProperty("goodId")
            .map(count).toProperty("count")
            .map(price).toProperty("price")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617153+08:00", comments="Source Table: order_good")
    default int insertSelective(OrderGoodDO record) {
        return MyBatis3Utils.insert(this::insert, record, orderGoodDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(orderId).toPropertyWhenPresent("orderId", record::getOrderId)
            .map(goodId).toPropertyWhenPresent("goodId", record::getGoodId)
            .map(count).toPropertyWhenPresent("count", record::getCount)
            .map(price).toPropertyWhenPresent("price", record::getPrice)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617375+08:00", comments="Source Table: order_good")
    default Optional<OrderGoodDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, orderGoodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617417+08:00", comments="Source Table: order_good")
    default List<OrderGoodDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, orderGoodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617457+08:00", comments="Source Table: order_good")
    default List<OrderGoodDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, orderGoodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617495+08:00", comments="Source Table: order_good")
    default Optional<OrderGoodDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617549+08:00", comments="Source Table: order_good")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, orderGoodDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617701+08:00", comments="Source Table: order_good")
    static UpdateDSL<UpdateModel> updateAllColumns(OrderGoodDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(orderId).equalTo(record::getOrderId)
                .set(goodId).equalTo(record::getGoodId)
                .set(count).equalTo(record::getCount)
                .set(price).equalTo(record::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.617956+08:00", comments="Source Table: order_good")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OrderGoodDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(orderId).equalToWhenPresent(record::getOrderId)
                .set(goodId).equalToWhenPresent(record::getGoodId)
                .set(count).equalToWhenPresent(record::getCount)
                .set(price).equalToWhenPresent(record::getPrice);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618175+08:00", comments="Source Table: order_good")
    default int updateByPrimaryKey(OrderGoodDO record) {
        return update(c ->
            c.set(orderId).equalTo(record::getOrderId)
            .set(goodId).equalTo(record::getGoodId)
            .set(count).equalTo(record::getCount)
            .set(price).equalTo(record::getPrice)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.618386+08:00", comments="Source Table: order_good")
    default int updateByPrimaryKeySelective(OrderGoodDO record) {
        return update(c ->
            c.set(orderId).equalToWhenPresent(record::getOrderId)
            .set(goodId).equalToWhenPresent(record::getGoodId)
            .set(count).equalToWhenPresent(record::getCount)
            .set(price).equalToWhenPresent(record::getPrice)
            .where(id, isEqualTo(record::getId))
        );
    }
}