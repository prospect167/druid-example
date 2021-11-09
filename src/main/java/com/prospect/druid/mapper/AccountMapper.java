package com.prospect.druid.mapper;

import com.prospect.druid.bean.db.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author: ant
 * @Date: 2021/11/9 2:07 下午
 */
@Mapper
public interface AccountMapper {

    /**
     * 保存
     * @param record 账户
     * @return
     */
    int insert(Account record);

    /**
     * 查询所有账户
     * @return List
     */
    List<Account> findAll();

}
