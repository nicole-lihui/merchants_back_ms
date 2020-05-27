package com.nicole.service;

import com.nicole.dao.mapper.LoginMapper;
import com.nicole.dao.model.LoginDO;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.nicole.dao.mapper.LoginDODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.SqlBuilder.select;

@Service
public class LoginService {

    @Autowired
    LoginMapper loginMapper;

    public LoginDO checkUser(String userName, String pw) {
//        SelectStatementProvider selectStatement = select(loginDO.allColumns())
//                .from(loginDO)
//                .where(phone, isEqualTo(userName))
//                .and(password, isEqualTo(pw))
//                .build()
//                .render(RenderingStrategies.MYBATIS3);
//        LoginDO login = loginMapper.selectOne(selectStatement).get();

        LoginDO login = selectLogin(userName);

        if (login != null)
            if (login.getPassword().equals(pw))
                return login;

        return null;
    }

    public LoginDO selectLogin(Integer lid) {
        Optional<LoginDO> op = loginMapper.selectOne(c -> c.where(id, isEqualTo(lid)));

        return op.isPresent() ? op.get() : null;
    }

    public LoginDO selectLogin(String lphone) {
        Optional<LoginDO> op = loginMapper.selectOne(c -> c.where(phone, isEqualTo(lphone)));

        return op.isPresent() ? op.get() : null;
    }

    public List<LoginDO> selectLogins() {
        SelectStatementProvider selectStatement = select(loginDO.allColumns())
                .from(loginDO)
                .build()
                .render(RenderingStrategies.MYBATIS3);

        return loginMapper.selectMany(selectStatement);
    }

    //    insert
    public int insertLogin(LoginDO login) {
        if (login == null || selectLogin(login.getPhone()) != null)
            return 0;

        int row = 0;
        try {
            row = loginMapper.insert(login);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

        return row;
    }

    //    update
    public int updatePassword(Integer lid, String pw) {
        if (lid == null)
            return 0;

        int row = 0;
        try {
            row = loginMapper.update(c -> c.set(password).equalTo(pw).where(id, isEqualTo(lid)));
        } catch (Exception e) {
            return 0;
        }

        return row;
    }

    public int updatePassword(String lphone, String pw) {
        if (lphone == null)
            return 0;

        int row = 0;
        try {
            row = loginMapper.update(c -> c.set(password).equalTo(pw).where(phone, isEqualTo(lphone)));
        } catch (Exception e) {
            return 0;
        }

        return row;
    }

    //    delete
    public int deleteLogin(Integer lid) {
        if (lid == null)
            return 0;

        int row = 0;
        try {
            row = loginMapper.delete(c -> c.where(id, isEqualTo(lid)));
        } catch (Exception e) {
            return 0;
        }

        return row;
    }

    public int deleteLogin(String lphone) {
        if (lphone == null)
            return 0;

        int row = 0;
        try {
            row = loginMapper.delete(c -> c.where(phone, isEqualTo(lphone)));
        } catch (Exception e) {
            return 0;
        }

        return row;
    }
}
