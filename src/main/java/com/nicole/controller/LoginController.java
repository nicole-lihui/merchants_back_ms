package com.nicole.controller;

import com.nicole.dao.model.LoginDO;
import com.nicole.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public LoginDO checkLogin(String username, String password) {
        LoginDO login = loginService.checkUser(username, password);

        return login;
    }

}
