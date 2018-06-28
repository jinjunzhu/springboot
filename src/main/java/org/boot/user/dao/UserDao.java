package org.boot.user.dao;

import org.boot.support.AbstractMybatisDaoSupport;
import org.boot.user.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @Author:jinjunzhu
 * @Description:
 * @Date: Created in 2018/6/27
 */
@Repository
public class UserDao extends AbstractMybatisDaoSupport<User> {

    public User getUserbyName(String username){
        return selectOne(firstSqlSession, "user.getUserbyName", username);
    }

}
