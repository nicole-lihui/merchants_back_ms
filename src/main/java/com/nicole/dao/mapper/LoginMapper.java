package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.LoginDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.LoginDO;
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
public interface LoginMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.578775+08:00", comments="Source Table: login")
    BasicColumn[] selectList = BasicColumn.columnList(id, phone, password, registerTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.569288+08:00", comments="Source Table: login")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.570022+08:00", comments="Source Table: login")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.570353+08:00", comments="Source Table: login")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<LoginDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.571004+08:00", comments="Source Table: login")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<LoginDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.571464+08:00", comments="Source Table: login")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("LoginDOResult")
    Optional<LoginDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.571942+08:00", comments="Source Table: login")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="LoginDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="register_time", property="registerTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<LoginDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.573281+08:00", comments="Source Table: login")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.573713+08:00", comments="Source Table: login")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, loginDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.574044+08:00", comments="Source Table: login")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, loginDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.574473+08:00", comments="Source Table: login")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.575103+08:00", comments="Source Table: login")
    default int insert(LoginDO record) {
        return MyBatis3Utils.insert(this::insert, record, loginDO, c ->
            c.map(id).toProperty("id")
            .map(phone).toProperty("phone")
            .map(password).toProperty("password")
            .map(registerTime).toProperty("registerTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.576316+08:00", comments="Source Table: login")
    default int insertMultiple(Collection<LoginDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, loginDO, c ->
            c.map(id).toProperty("id")
            .map(phone).toProperty("phone")
            .map(password).toProperty("password")
            .map(registerTime).toProperty("registerTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.576828+08:00", comments="Source Table: login")
    default int insertSelective(LoginDO record) {
        return MyBatis3Utils.insert(this::insert, record, loginDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(phone).toPropertyWhenPresent("phone", record::getPhone)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(registerTime).toPropertyWhenPresent("registerTime", record::getRegisterTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.579898+08:00", comments="Source Table: login")
    default Optional<LoginDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, loginDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.580685+08:00", comments="Source Table: login")
    default List<LoginDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, loginDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.581313+08:00", comments="Source Table: login")
    default List<LoginDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, loginDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.582001+08:00", comments="Source Table: login")
    default Optional<LoginDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.582473+08:00", comments="Source Table: login")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, loginDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.582889+08:00", comments="Source Table: login")
    static UpdateDSL<UpdateModel> updateAllColumns(LoginDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(phone).equalTo(record::getPhone)
                .set(password).equalTo(record::getPassword)
                .set(registerTime).equalTo(record::getRegisterTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.583346+08:00", comments="Source Table: login")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(LoginDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(phone).equalToWhenPresent(record::getPhone)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(registerTime).equalToWhenPresent(record::getRegisterTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.584055+08:00", comments="Source Table: login")
    default int updateByPrimaryKey(LoginDO record) {
        return update(c ->
            c.set(phone).equalTo(record::getPhone)
            .set(password).equalTo(record::getPassword)
            .set(registerTime).equalTo(record::getRegisterTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.584512+08:00", comments="Source Table: login")
    default int updateByPrimaryKeySelective(LoginDO record) {
        return update(c ->
            c.set(phone).equalToWhenPresent(record::getPhone)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(registerTime).equalToWhenPresent(record::getRegisterTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}