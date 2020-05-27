package com.nicole.service;

import com.nicole.dao.mapper.AccountMapper;
import com.nicole.dao.model.AccountDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.nicole.dao.mapper.LoginDODynamicSqlSupport.phone;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public AccountDO selectAccountByPhone(String lphone) {
        Optional<AccountDO> op = accountMapper.selectOne(c -> c.where(phone, isEqualTo(lphone)));

        return op.isPresent() ? op.get() : null;
    }
}
