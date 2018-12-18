package com.jakcray.springbootshiro.shiro.service.Impl;

import com.jakcray.springbootshiro.shiro.ShiroDao.ShiroDao;
import com.jakcray.springbootshiro.shiro.ShiroMapper.IShiroMapper;
import com.jakcray.springbootshiro.shiro.service.IShiroSelect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("shiroSelectImpl")
public class ShiroSelectImpl implements IShiroSelect {

    @Autowired
    IShiroMapper iShiroMapper;

    @Override
    public ShiroDao getShiroDaoByUserName(String username) {

        ShiroDao shiroDaoByUserName = iShiroMapper.getShiroDaoByUserName(username);

        return shiroDaoByUserName;
    }
}
