package com.jakcray.springbootshiro.shiro.ShiroDao;

import java.util.HashSet;
import java.util.Set;

public class ShiroDao {
    Set<String> roles = new HashSet<String>();
    Set<String> permissions = new HashSet<String>();

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public Set<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<String> permissions) {
        this.permissions = permissions;
    }
}
