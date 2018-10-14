package com.itheima.service.Impl;

import com.itheima.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountService implements com.itheima.service.AccountService {
    public List<Account> findAll() {
        System.out.println("业务层:执行了findAll方法....");
        return null;
    }

    public void saveAccount(Account account) {

    }
}
