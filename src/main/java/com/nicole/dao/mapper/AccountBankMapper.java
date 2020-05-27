package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.AccountBankDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.AccountBankDO;
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
public interface AccountBankMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622145+08:00", comments="Source Table: account_bank")
    BasicColumn[] selectList = BasicColumn.columnList(id, accountId, bankId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621343+08:00", comments="Source Table: account_bank")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62138+08:00", comments="Source Table: account_bank")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621437+08:00", comments="Source Table: account_bank")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<AccountBankDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621498+08:00", comments="Source Table: account_bank")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<AccountBankDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621556+08:00", comments="Source Table: account_bank")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AccountBankDOResult")
    Optional<AccountBankDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621628+08:00", comments="Source Table: account_bank")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AccountBankDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="account_id", property="accountId", jdbcType=JdbcType.INTEGER),
        @Result(column="bank_id", property="bankId", jdbcType=JdbcType.INTEGER)
    })
    List<AccountBankDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621713+08:00", comments="Source Table: account_bank")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621753+08:00", comments="Source Table: account_bank")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, accountBankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621788+08:00", comments="Source Table: account_bank")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, accountBankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621836+08:00", comments="Source Table: account_bank")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621887+08:00", comments="Source Table: account_bank")
    default int insert(AccountBankDO record) {
        return MyBatis3Utils.insert(this::insert, record, accountBankDO, c ->
            c.map(id).toProperty("id")
            .map(accountId).toProperty("accountId")
            .map(bankId).toProperty("bankId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.621949+08:00", comments="Source Table: account_bank")
    default int insertMultiple(Collection<AccountBankDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, accountBankDO, c ->
            c.map(id).toProperty("id")
            .map(accountId).toProperty("accountId")
            .map(bankId).toProperty("bankId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622037+08:00", comments="Source Table: account_bank")
    default int insertSelective(AccountBankDO record) {
        return MyBatis3Utils.insert(this::insert, record, accountBankDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(accountId).toPropertyWhenPresent("accountId", record::getAccountId)
            .map(bankId).toPropertyWhenPresent("bankId", record::getBankId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622193+08:00", comments="Source Table: account_bank")
    default Optional<AccountBankDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, accountBankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622241+08:00", comments="Source Table: account_bank")
    default List<AccountBankDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, accountBankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622282+08:00", comments="Source Table: account_bank")
    default List<AccountBankDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, accountBankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62232+08:00", comments="Source Table: account_bank")
    default Optional<AccountBankDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622361+08:00", comments="Source Table: account_bank")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, accountBankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622413+08:00", comments="Source Table: account_bank")
    static UpdateDSL<UpdateModel> updateAllColumns(AccountBankDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(accountId).equalTo(record::getAccountId)
                .set(bankId).equalTo(record::getBankId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622486+08:00", comments="Source Table: account_bank")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(AccountBankDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(accountId).equalToWhenPresent(record::getAccountId)
                .set(bankId).equalToWhenPresent(record::getBankId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.622597+08:00", comments="Source Table: account_bank")
    default int updateByPrimaryKey(AccountBankDO record) {
        return update(c ->
            c.set(accountId).equalTo(record::getAccountId)
            .set(bankId).equalTo(record::getBankId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62271+08:00", comments="Source Table: account_bank")
    default int updateByPrimaryKeySelective(AccountBankDO record) {
        return update(c ->
            c.set(accountId).equalToWhenPresent(record::getAccountId)
            .set(bankId).equalToWhenPresent(record::getBankId)
            .where(id, isEqualTo(record::getId))
        );
    }
}