package com.nicole.service;


import com.nicole.dao.model.LoginDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServiceTest {

    @Autowired
    private LoginService loginService;

    @Test
    public void checkLogin() {
        LoginDO login = loginService.checkUser("15116660781", "maxwit");

        assertTrue(login != null);
    }

    @Test
    public void insertLogin() {
        String lphone = "15116660781";
        String pw = "maxwit";
        if (loginService.selectLogin(lphone) == null) {
            LoginDO lo = new LoginDO();
            lo.setPhone(lphone);
            lo.setPassword(pw);
            int row = loginService.insertLogin(lo);
            assertTrue(row == 1);
        }
    }

    @Test
    public void selectAll() {
        List<LoginDO> ls = loginService.selectLogins();

        assertTrue(ls != null);
    }

    @Test
    public void selectOne() {
        LoginDO l1 = loginService.selectLogin(1);
        assertTrue(l1 != null);

        LoginDO l2 = loginService.selectLogin("15116660781");
        assertTrue(l2 != null);
    }

    @Test
    public void delete() {
        String lphone = "15100000002";
        String pw = "maxwit";

        LoginDO lo = new LoginDO();
        lo.setPhone(lphone);
        lo.setPassword(pw);
        loginService.insertLogin(lo);

        int row = loginService.deleteLogin(lphone);
        assertTrue(row == 1);
    }

}
