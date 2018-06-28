package org.boot.user.domain;

/**
 * @Author:jinjunzhu
 * @Description:
 * @Date: Created in 2018/6/27
 */
public class Role {
    /**角色id**/
    Integer roleId;
    /**角色名称**/
    String roleName;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
