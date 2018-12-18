package com.jakcray.springbootshiro.shiro.ShiroMapper;

import com.jakcray.springbootshiro.shiro.ShiroDao.ShiroDao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IShiroMapper {

    public ShiroDao getShiroDaoByUserName(String username);

}
