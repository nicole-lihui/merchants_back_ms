package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.AccountDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.AccountDO;
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
public interface AccountMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.589845+08:00", comments="Source Table: account")
    BasicColumn[] selectList = BasicColumn.columnList(id, phone, shopId, userName, money);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.588451+08:00", comments="Source Table: account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.588552+08:00", comments="Source Table: account")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.588627+08:00", comments="Source Table: account")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.58869+08:00", comments="Source Table: account")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.588755+08:00", comments="Source Table: account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AccountDOResult")
    Optional<AccountDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.588863+08:00", comments="Source Table: account")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_id", property="shopId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="money", property="money", jdbcType=JdbcType.DECIMAL)
    })
    List<AccountDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.589089+08:00", comments="Source Table: account")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.58921+08:00", comments="Source Table: account")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.589278+08:00", comments="Source Table: account")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.589336+08:00", comments="Source Table: account")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.589421+08:00", comments="Source Table: account")
    default int insert(AccountDO record) {
        return MyBatis3Utils.insert(this::insert, record, accountDO, c ->
            c.map(id).toProperty("id")
            .map(phone).toProperty("phone")
            .map(shopId).toProperty("shopId")
            .map(userName).toProperty("userName")
            .map(money).toProperty("money")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.589553+08:00", comments="Source Table: account")
    default int insertMultiple(Collection<AccountDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountDO, c ->
            c.map(id).toProperty("id")
            .map(phone).toProperty("phone")
            .map(shopId).toProperty("shopId")
            .map(userName).toProperty("userName")
            .map(money).toProperty("money")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.5897+08:00", comments="Source Table: account")
    default int insertSelective(AccountDO record) {
        return MyBatis3Utils.insert(this::insert, record, accountDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(shopId).toPropertyWhenPresent("shopId", record::getShopId)
            .map(userName).toPropertyWhenPresent("userName", record::getUserName)
            .map(money).toPropertyWhenPresent("money", record::getMoney)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.589904+08:00", comments="Source Table: account")
    default Optional<AccountDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.589967+08:00", comments="Source Table: account")
    default List<AccountDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.590026+08:00", comments="Source Table: account")
    default List<AccountDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.590083+08:00", comments="Source Table: account")
    default Optional<AccountDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.590146+08:00", comments="Source Table: account")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.590205+08:00", comments="Source Table: account")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(phone).equalTo(record::getPhone)
                .set(shopId).equalTo(record::getShopId)
                .set(userName).equalTo(record::getUserName)
                .set(money).equalTo(record::getMoney);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.590308+08:00", comments="Source Table: account")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(shopId).equalToWhenPresent(record::getShopId)
                .set(userName).equalToWhenPresent(record::getUserName)
                .set(money).equalToWhenPresent(record::getMoney);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.590428+08:00", comments="Source Table: account")
    default int updateByPrimaryKey(AccountDO record) {
        return update(c ->
            c.set(phone).equalTo(record::getPhone)
            .set(shopId).equalTo(record::getShopId)
            .set(userName).equalTo(record::getUserName)
            .set(money).equalTo(record::getMoney)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.590543+08:00", comments="Source Table: account")
    default int updateByPrimaryKeySelective(AccountDO record) {
        return update(c ->
            c.set(phone).equalToWhenPresent(record::getPhone)
            .set(shopId).equalToWhenPresent(record::getShopId)
            .set(userName).equalToWhenPresent(record::getUserName)
            .set(money).equalToWhenPresent(record::getMoney)
            .where(id, isEqualTo(record::getId))
        );
    }
}