package com.nicole.controller;

import com.nicole.dao.model.AccountDO;
import com.nicole.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/account")
    public AccountDO getAccount(String phone) {
        AccountDO account = accountService.selectAccountByPhone(phone);
        return account;
    }

}
