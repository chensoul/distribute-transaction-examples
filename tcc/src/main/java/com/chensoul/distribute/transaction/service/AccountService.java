package com.chensoul.distribute.transaction.service;

import com.chensoul.distribute.transaction.db131.dao.AccountAMapper;
import com.chensoul.distribute.transaction.db131.model.AccountA;
import com.chensoul.distribute.transaction.db132.dao.AccountBMapper;
import com.chensoul.distribute.transaction.db132.model.AccountB;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class AccountService {
    @Resource
    private AccountAMapper accountAMapper;
    @Resource
    private AccountBMapper accountBMapper;

    @Transactional(transactionManager = "tm131",rollbackFor = Exception.class)
    public void transferAccount(){
        AccountA accountA = accountAMapper.selectByPrimaryKey(1);
        accountA.setBalance(accountA.getBalance().subtract(new BigDecimal(200)));
        accountAMapper.updateByPrimaryKey(accountA);

        AccountB accountB = accountBMapper.selectByPrimaryKey(2);
        accountB.setBalance(accountB.getBalance().add(new BigDecimal(200)));
        accountBMapper.updateByPrimaryKey(accountB);

        try{
            int i = 1/0;
        }catch (Exception e){

            try{
                AccountB accountb = accountBMapper.selectByPrimaryKey(2);
                accountb.setBalance(accountb.getBalance().subtract(new BigDecimal(200)));
                accountBMapper.updateByPrimaryKey(accountb);
            }catch (Exception e1){

            }


            throw e;
        }

    }



}
