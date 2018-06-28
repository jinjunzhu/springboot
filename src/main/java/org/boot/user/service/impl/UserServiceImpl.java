package org.boot.user.service.impl;

import org.boot.user.dao.RoleDao;
import org.boot.user.dao.UserDao;
import org.boot.user.domain.Role;
import org.boot.user.domain.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:jinjunzhu
 * @Description
 * @Date: Created in 2018/6/5
 */
@Service("userService")
public class UserServiceImpl implements UserDetailsService {

    @Resource
    private RoleDao roleDao;

    @Resource
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) { //重写loadUserByUsername 方法获得 userdetails 类型用户

        if(username == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        User user = userDao.getUserbyName(username);
        List<Role> roles = roleDao.getRolebyUserId(user.getId());
        //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
        for(Role role:roles)
        {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return new org.springframework.security.core.userdetails.User("xiaoming",user.getPassword(), authorities);
    }
}

