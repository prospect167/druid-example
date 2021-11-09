package com.prospect.druid.controller;

import com.prospect.druid.bean.db.Account;
import com.prospect.druid.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: ant
 * @Date: 2021/11/9 2:15 下午
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private AccountService accountService;

    @GetMapping("/test")
    public boolean test() {
        Account account = new Account();
        account.setName("小明");
        account.setBalance(100);
        return accountService.insert(account);
    }

    @GetMapping("/list")
    public List<Account> list() {
        return accountService.findAll();
    }
}
