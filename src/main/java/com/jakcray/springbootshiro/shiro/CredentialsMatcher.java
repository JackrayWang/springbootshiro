package com.jakcray.springbootshiro.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

/**
 * 校验密码
 */
public class CredentialsMatcher extends SimpleCredentialsMatcher {

    @Override
    public boolean doCredentialsMatch(AuthenticationToken authenticationToken, AuthenticationInfo info){
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        //获得用户输入的密码
        String inPasssword = new String(token.getPassword());
        //获得数据库中的密码
        String dbPassword = (String) info.getCredentials();

        return  this.equals(inPasssword,dbPassword);
    }

}
