package org.boot.user.domain;

import java.util.List;

/**
 * @Author:jinjunzhu
 * @Description:
 * @Date: Created in 2018/6/27
 */
public class User {

    /**用户ID**/
    private Integer id;
    /**用户名称**/
    private String userName;
    /**用户密码**/
    private String password;
    /**用户角色列表**/
    private List<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
