package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.AccountRunningDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.AccountRunningDO;
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
public interface AccountRunningMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624994+08:00", comments="Source Table: account_running")
    BasicColumn[] selectList = BasicColumn.columnList(id, accountId, bankId, withdrawal, wTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62388+08:00", comments="Source Table: account_running")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623919+08:00", comments="Source Table: account_running")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623955+08:00", comments="Source Table: account_running")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountRunningDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.623997+08:00", comments="Source Table: account_running")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountRunningDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624038+08:00", comments="Source Table: account_running")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AccountRunningDOResult")
    Optional<AccountRunningDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624088+08:00", comments="Source Table: account_running")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountRunningDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="bank_id", property="bankId", jdbcType=JdbcType.INTEGER),
        @Result(column="withdrawal", property="withdrawal", jdbcType=JdbcType.DECIMAL),
        @Result(column="w_time", property="wTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AccountRunningDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624176+08:00", comments="Source Table: account_running")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624232+08:00", comments="Source Table: account_running")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountRunningDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624282+08:00", comments="Source Table: account_running")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountRunningDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624329+08:00", comments="Source Table: account_running")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624385+08:00", comments="Source Table: account_running")
    default int insert(AccountRunningDO record) {
        return MyBatis3Utils.insert(this::insert, record, accountRunningDO, c ->
            c.map(id).toProperty("id")
            .map(accountId).toProperty("accountId")
            .map(bankId).toProperty("bankId")
            .map(withdrawal).toProperty("withdrawal")
            .map(wTime).toProperty("wTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624477+08:00", comments="Source Table: account_running")
    default int insertMultiple(Collection<AccountRunningDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountRunningDO, c ->
            c.map(id).toProperty("id")
            .map(accountId).toProperty("accountId")
            .map(bankId).toProperty("bankId")
            .map(withdrawal).toProperty("withdrawal")
            .map(wTime).toProperty("wTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.624885+08:00", comments="Source Table: account_running")
    default int insertSelective(AccountRunningDO record) {
        return MyBatis3Utils.insert(this::insert, record, accountRunningDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(accountId).toPropertyWhenPresent("accountId", record::getAccountId)
            .map(bankId).toPropertyWhenPresent("bankId", record::getBankId)
            .map(withdrawal).toPropertyWhenPresent("withdrawal", record::getWithdrawal)
            .map(wTime).toPropertyWhenPresent("wTime", record::getwTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625033+08:00", comments="Source Table: account_running")
    default Optional<AccountRunningDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountRunningDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625074+08:00", comments="Source Table: account_running")
    default List<AccountRunningDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountRunningDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625113+08:00", comments="Source Table: account_running")
    default List<AccountRunningDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountRunningDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625152+08:00", comments="Source Table: account_running")
    default Optional<AccountRunningDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625192+08:00", comments="Source Table: account_running")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountRunningDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625228+08:00", comments="Source Table: account_running")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountRunningDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(accountId).equalTo(record::getAccountId)
                .set(bankId).equalTo(record::getBankId)
                .set(withdrawal).equalTo(record::getWithdrawal)
                .set(wTime).equalTo(record::getwTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625301+08:00", comments="Source Table: account_running")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountRunningDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(accountId).equalToWhenPresent(record::getAccountId)
                .set(bankId).equalToWhenPresent(record::getBankId)
                .set(withdrawal).equalToWhenPresent(record::getWithdrawal)
                .set(wTime).equalToWhenPresent(record::getwTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625421+08:00", comments="Source Table: account_running")
    default int updateByPrimaryKey(AccountRunningDO record) {
        return update(c ->
            c.set(accountId).equalTo(record::getAccountId)
            .set(bankId).equalTo(record::getBankId)
            .set(withdrawal).equalTo(record::getWithdrawal)
            .set(wTime).equalTo(record::getwTime)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.625569+08:00", comments="Source Table: account_running")
    default int updateByPrimaryKeySelective(AccountRunningDO record) {
        return update(c ->
            c.set(accountId).equalToWhenPresent(record::getAccountId)
            .set(bankId).equalToWhenPresent(record::getBankId)
            .set(withdrawal).equalToWhenPresent(record::getWithdrawal)
            .set(wTime).equalToWhenPresent(record::getwTime)
            .where(id, isEqualTo(record::getId))
        );
    }
}