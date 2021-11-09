package com.prospect.druid.service.impl;

import com.prospect.druid.bean.db.Account;
import com.prospect.druid.mapper.AccountMapper;
import com.prospect.druid.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: ant
 * @Date: 2021/11/9 2:13 下午
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public boolean insert(Account account) {
        int result = accountMapper.insert(account);
        return result > 0 ? true : false;
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
