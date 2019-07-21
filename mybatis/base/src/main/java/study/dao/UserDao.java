package study.dao;


import org.apache.ibatis.annotations.Select;
import study.entity.User;

import java.util.List;

/**
 *
 * 用户的持久层接口
 * //使用注解方式，需要将 UserDao.xml 删掉，更改SqlMapConfig.xml 下面的mappers 中的 resource 更改为 class
 *
 */
public interface UserDao {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user where id in (41,42)")
    List<User> findAll();
}
