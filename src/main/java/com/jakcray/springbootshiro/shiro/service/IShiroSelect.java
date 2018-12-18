package com.jakcray.springbootshiro.shiro.service;

import com.jakcray.springbootshiro.shiro.ShiroDao.ShiroDao;

import java.util.List;

public interface IShiroSelect {
    public ShiroDao getShiroDaoByUserName(String username);
}
