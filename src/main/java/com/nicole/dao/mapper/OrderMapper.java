package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.OrderDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.OrderDO;
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
public interface OrderMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600432+08:00", comments="Source Table: orders")
    BasicColumn[] selectList = BasicColumn.columnList(id, shopId, phone, userName, paytype, address, statusId, startTime, endTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599375+08:00", comments="Source Table: orders")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599435+08:00", comments="Source Table: orders")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599489+08:00", comments="Source Table: orders")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<OrderDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599543+08:00", comments="Source Table: orders")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<OrderDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599603+08:00", comments="Source Table: orders")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("OrderDOResult")
    Optional<OrderDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599699+08:00", comments="Source Table: orders")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="OrderDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="payType", property="paytype", jdbcType=JdbcType.INTEGER),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="status_id", property="statusId", jdbcType=JdbcType.INTEGER),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<OrderDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599837+08:00", comments="Source Table: orders")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.59989+08:00", comments="Source Table: orders")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, orderDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.599957+08:00", comments="Source Table: orders")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, orderDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600002+08:00", comments="Source Table: orders")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600069+08:00", comments="Source Table: orders")
    default int insert(OrderDO record) {
        return MyBatis3Utils.insert(this::insert, record, orderDO, c ->
            c.map(id).toProperty("id")
            .map(shopId).toProperty("shopId")
            .map(phone).toProperty("phone")
            .map(userName).toProperty("userName")
            .map(paytype).toProperty("paytype")
            .map(address).toProperty("address")
            .map(statusId).toProperty("statusId")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.60017+08:00", comments="Source Table: orders")
    default int insertMultiple(Collection<OrderDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, orderDO, c ->
            c.map(id).toProperty("id")
            .map(shopId).toProperty("shopId")
            .map(phone).toProperty("phone")
            .map(userName).toProperty("userName")
            .map(paytype).toProperty("paytype")
            .map(address).toProperty("address")
            .map(statusId).toProperty("statusId")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600266+08:00", comments="Source Table: orders")
    default int insertSelective(OrderDO record) {
        return MyBatis3Utils.insert(this::insert, record, orderDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(shopId).toPropertyWhenPresent("shopId", record::getShopId)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(userName).toPropertyWhenPresent("userName", record::getUserName)
            .map(paytype).toPropertyWhenPresent("paytype", record::getPaytype)
            .map(address).toPropertyWhenPresent("address", record::getAddress)
            .map(statusId).toPropertyWhenPresent("statusId", record::getStatusId)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(endTime).toPropertyWhenPresent("endTime", record::getEndTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600481+08:00", comments="Source Table: orders")
    default Optional<OrderDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, orderDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600534+08:00", comments="Source Table: orders")
    default List<OrderDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, orderDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600584+08:00", comments="Source Table: orders")
    default List<OrderDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, orderDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600639+08:00", comments="Source Table: orders")
    default Optional<OrderDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600691+08:00", comments="Source Table: orders")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, orderDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600742+08:00", comments="Source Table: orders")
    static UpdateDSL<UpdateModel> updateAllColumns(OrderDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(shopId).equalTo(record::getShopId)
                .set(phone).equalTo(record::getPhone)
                .set(userName).equalTo(record::getUserName)
                .set(paytype).equalTo(record::getPaytype)
                .set(address).equalTo(record::getAddress)
                .set(statusId).equalTo(record::getStatusId)
                .set(startTime).equalTo(record::getStartTime)
                .set(endTime).equalTo(record::getEndTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600851+08:00", comments="Source Table: orders")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(OrderDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(paytype).equalToWhenPresent(record::getPaytype)
                .set(address).equalToWhenPresent(record::getAddress)
                .set(statusId).equalToWhenPresent(record::getStatusId)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(endTime).equalToWhenPresent(record::getEndTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.600973+08:00", comments="Source Table: orders")
    default int updateByPrimaryKey(OrderDO record) {
        return update(c ->
            c.set(shopId).equalTo(record::getShopId)
            .set(phone).equalTo(record::getPhone)
            .set(userName).equalTo(record::getUserName)
            .set(paytype).equalTo(record::getPaytype)
            .set(address).equalTo(record::getAddress)
            .set(statusId).equalTo(record::getStatusId)
            .set(startTime).equalTo(record::getStartTime)
            .set(endTime).equalTo(record::getEndTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.601082+08:00", comments="Source Table: orders")
    default int updateByPrimaryKeySelective(OrderDO record) {
        return update(c ->
            c.set(shopId).equalToWhenPresent(record::getShopId)
            .set(phone).equalToWhenPresent(record::getPhone)
            .set(userName).equalToWhenPresent(record::getUserName)
            .set(paytype).equalToWhenPresent(record::getPaytype)
            .set(address).equalToWhenPresent(record::getAddress)
            .set(statusId).equalToWhenPresent(record::getStatusId)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .set(endTime).equalToWhenPresent(record::getEndTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}