package spring.ioc.dao.impl;

import org.springframework.stereotype.Repository;
import spring.ioc.dao.AccountDao;

/**
 * 账户的持久层实现类
 */
@Repository("accountDao1")
public class AccountDaoImpl implements AccountDao {

    public void saveAccount() {

        System.out.println("保存了账户1111111111111");
    }
}
