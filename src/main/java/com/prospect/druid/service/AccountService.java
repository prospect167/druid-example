package com.prospect.druid.service;

import com.prospect.druid.bean.db.Account;

import java.util.List;

/**
 * @author: ant
 * @Date: 2021/11/9 2:11 下午
 */
public interface AccountService {

    /**
     * 保存
     * @param account
     * @return
     */
    boolean insert(Account account);


    List<Account> findAll();
}
