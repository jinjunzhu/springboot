package org.boot.user.dao;

import org.boot.support.AbstractMybatisDaoSupport;
import org.boot.user.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:jinjunzhu
 * @Description:
 * @Date: Created in 2018/6/27
 */
@Repository
public class RoleDao extends AbstractMybatisDaoSupport<Role> {

    public List<Role> getRolebyUserId(Integer userId){
        return selectList(firstSqlSession, "user.getRolebyUserId", userId);
    }
}
