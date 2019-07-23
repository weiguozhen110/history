package spring.ioc.dao.impl;

import org.springframework.stereotype.Repository;
import spring.ioc.dao.AccountDao;

/**
 * 账户的持久层实现类
 */
@Repository("accountDao2")
public class AccountDaoImpl2 implements AccountDao {

    public void saveAccount() {

        System.out.println("保存了账户2222222222222");
    }
}
