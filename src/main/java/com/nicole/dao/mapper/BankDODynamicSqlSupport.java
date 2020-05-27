package com.nicole.dao.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class BankDODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619032+08:00", comments="Source Table: bank")
    public static final BankDO bankDO = new BankDO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619195+08:00", comments="Source field: bank.id")
    public static final SqlColumn<Integer> id = bankDO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619243+08:00", comments="Source field: bank.bank_name")
    public static final SqlColumn<String> bankName = bankDO.bankName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619286+08:00", comments="Source field: bank.first_letter")
    public static final SqlColumn<String> firstLetter = bankDO.firstLetter;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-05-16T20:46:51.619113+08:00", comments="Source Table: bank")
    public static final class BankDO extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<String> bankName = column("bank_name", JDBCType.VARCHAR);

        public final SqlColumn<String> firstLetter = column("first_letter", JDBCType.VARCHAR);

        public BankDO() {
            super("bank");
        }
    }
}