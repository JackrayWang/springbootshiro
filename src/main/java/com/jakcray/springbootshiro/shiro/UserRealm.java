package com.jakcray.springbootshiro.shiro;

import com.jakcray.springbootshiro.controller.TestController;
import com.jakcray.springbootshiro.mybatisutils.dao.UserDAO;
import com.jakcray.springbootshiro.utils.UtilsStatus;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRealm extends AuthorizingRealm {


    private static final Logger logger = LoggerFactory.getLogger(UserRealm.class.getName());

    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        logger.info("-------------------------授权----------------");

        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //获取用户名
        String username = (String)principalCollection.getPrimaryPrincipal();

        Set<String>  roleSet = new HashSet<>();
        Set<String> permissionSet = new HashSet<>();



        //将角色名称提供给授权
        simpleAuthorizationInfo.setRoles(roleSet);
        //将权限名称提供给授权
        simpleAuthorizationInfo.setStringPermissions(permissionSet);
        return simpleAuthorizationInfo;
    }


    //认证

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        logger.info("-------------------------认证----------------");
        String username=(String)authenticationToken.getPrincipal();

        UserDAO user = new UserDAO();
        if(user== null){
            throw new UnknownAccountException();
        }
        if(UtilsStatus.LOCKED.equals(user.getStatus())){
            throw new LockedAccountException("账户永久锁定，请联系管理人员！");
        }
        if(UtilsStatus.TEMP_LOCKED.equals(user.getStatus())){
            throw new LockedAccountException("账户临时锁定，24小时候自动解锁！");
        }
        //密码可以通过SimpleHash加密，然后保存到数据库
        //此处是获取数据库内的账号、密码、盐值，保存到登录信息info中
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
                user.getUsername(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getEmail()),
                getName());

        return simpleAuthenticationInfo;
    }
}
