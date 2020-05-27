package com.nicole.dao.mapper;

import static com.nicole.dao.mapper.BankDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.nicole.dao.model.BankDO;
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
public interface BankMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62011+08:00", comments="Source Table: bank")
    BasicColumn[] selectList = BasicColumn.columnList(id, bankName, firstLetter);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619328+08:00", comments="Source Table: bank")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619372+08:00", comments="Source Table: bank")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.61941+08:00", comments="Source Table: bank")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<BankDO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619452+08:00", comments="Source Table: bank")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<BankDO> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619497+08:00", comments="Source Table: bank")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("BankDOResult")
    Optional<BankDO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619547+08:00", comments="Source Table: bank")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="BankDOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bank_name", property="bankName", jdbcType=JdbcType.VARCHAR),
        @Result(column="first_letter", property="firstLetter", jdbcType=JdbcType.VARCHAR)
    })
    List<BankDO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619693+08:00", comments="Source Table: bank")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619737+08:00", comments="Source Table: bank")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, bankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619775+08:00", comments="Source Table: bank")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, bankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619814+08:00", comments="Source Table: bank")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619855+08:00", comments="Source Table: bank")
    default int insert(BankDO record) {
        return MyBatis3Utils.insert(this::insert, record, bankDO, c ->
            c.map(id).toProperty("id")
            .map(bankName).toProperty("bankName")
            .map(firstLetter).toProperty("firstLetter")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619931+08:00", comments="Source Table: bank")
    default int insertMultiple(Collection<BankDO> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, bankDO, c ->
            c.map(id).toProperty("id")
            .map(bankName).toProperty("bankName")
            .map(firstLetter).toProperty("firstLetter")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619999+08:00", comments="Source Table: bank")
    default int insertSelective(BankDO record) {
        return MyBatis3Utils.insert(this::insert, record, bankDO, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(bankName).toPropertyWhenPresent("bankName", record::getBankName)
            .map(firstLetter).toPropertyWhenPresent("firstLetter", record::getFirstLetter)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62015+08:00", comments="Source Table: bank")
    default Optional<BankDO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, bankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620192+08:00", comments="Source Table: bank")
    default List<BankDO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, bankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620234+08:00", comments="Source Table: bank")
    default List<BankDO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, bankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620285+08:00", comments="Source Table: bank")
    default Optional<BankDO> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620326+08:00", comments="Source Table: bank")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, bankDO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620366+08:00", comments="Source Table: bank")
    static UpdateDSL<UpdateModel> updateAllColumns(BankDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(bankName).equalTo(record::getBankName)
                .set(firstLetter).equalTo(record::getFirstLetter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620457+08:00", comments="Source Table: bank")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(BankDO record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(bankName).equalToWhenPresent(record::getBankName)
                .set(firstLetter).equalToWhenPresent(record::getFirstLetter);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.62056+08:00", comments="Source Table: bank")
    default int updateByPrimaryKey(BankDO record) {
        return update(c ->
            c.set(bankName).equalTo(record::getBankName)
            .set(firstLetter).equalTo(record::getFirstLetter)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.620634+08:00", comments="Source Table: bank")
    default int updateByPrimaryKeySelective(BankDO record) {
        return update(c ->
            c.set(bankName).equalToWhenPresent(record::getBankName)
            .set(firstLetter).equalToWhenPresent(record::getFirstLetter)
            .where(id, isEqualTo(record::getId))
        );
    }
}