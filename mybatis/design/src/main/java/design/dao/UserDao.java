package design.dao;


import design.domain.User;
import design.mybatis.annotations.Select;

import java.util.List;

/**
 *
 * 用户的持久层接口
 */
public interface UserDao {

    /**
     * 查询所有操作
     * @return
     */
    @Select("select * from user")
    List<User> findAll();
}
