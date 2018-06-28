package test.boot.dao;

import org.boot.user.dao.RoleDao;
import org.boot.user.dao.UserDao;
import org.boot.user.domain.Role;
import org.boot.user.domain.User;
import org.junit.Test;
import test.support.SpringTxTestCase;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:jinjunzhu
 * @Description:
 * @Date: Created in 2018/6/27
 */
public class UserDaoTest extends SpringTxTestCase{

    @Resource
    private UserDao userDao;

    @Resource
    private RoleDao roleDao;

    @Test
    public void testGetUserByName(){
        User user = userDao.getUserbyName("xiaoming");
        logger.info(user.getPassword());
        }

    @Test
    public void testGetRolebyUserId(){
        List<Role> roles = roleDao.getRolebyUserId(1);
        logger.info(roles.size() +  "--------------");
    }
}
