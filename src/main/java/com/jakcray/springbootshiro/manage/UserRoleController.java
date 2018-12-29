package com.jakcray.springbootshiro.manage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jakcray.springbootshiro.mybatisutils.dao.*;
import com.jakcray.springbootshiro.mybatisutils.mapper.RoleDAOMapper;
import com.jakcray.springbootshiro.mybatisutils.mapper.UserRoleDAOMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class UserRoleController {

    @Autowired
    UserRoleDAOMapper userRoleDAOMapper;

    @Autowired
    RoleDAOMapper roleDAOMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserViewController.class.getName());

    //根据iduser 查询出所有的 权限
    @RequestMapping(value = "/getTheManagerRoles" ,method = RequestMethod.POST)
    @ResponseBody
//    public String getTheManagerRoles(@RequestBody UserRoleDAO userRoleDAO){
    public String getTheManagerRoles(String iduser){
        //查询user  role 关联表
        UserRoleDAOExample urde = new UserRoleDAOExample();
        UserRoleDAOExample.Criteria criteria = urde.createCriteria().andIduserEqualTo(iduser);
        List<UserRoleDAO> userRoleDAOS = userRoleDAOMapper.selectByExample(urde);
        List<String> idRoleList = new ArrayList<String>();
        for(UserRoleDAO urd:userRoleDAOS){
            String idrole = urd.getIdrole();
            idRoleList.add(idrole);
        }
        List<RoleDAO> roleDAOS = new ArrayList<RoleDAO>();
        //查询 此用户下面 所有的权限
        if(idRoleList.size() != 0){
            RoleDAOExample rde = new RoleDAOExample();
            rde.createCriteria().andIdroleIn(idRoleList);
            roleDAOS = roleDAOMapper.selectByExample(rde);
        }
        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",roleDAOS);
        return obj.toString();
    }

    //给用户增加权限
    @RequestMapping(value = "/managerRoleAdd" ,method = RequestMethod.POST)
    @ResponseBody
    public String managerRoleAdd(@RequestBody UserRoleDAO userRoleDAO){
//        logger.info("====>adduserrole<=======");
//        logger.info(JSON.toJSONString(userRoleDAO));

        userRoleDAO.setIduserRole(UUID.randomUUID().toString());
        userRoleDAO.setAddtime(new Date());
        userRoleDAO.setTs(new Date());
        userRoleDAOMapper.insert(userRoleDAO);
        JSONObject obj = new JSONObject();
        obj.put("status","用户添加权限成功");
        return obj.toString();
    }

    //删除用户权限
    @RequestMapping(value = "/managerRoleDelete" ,method = RequestMethod.POST)
    @ResponseBody
    public String managerRoleDelete(@RequestBody UserRoleDAO userRoleDAO){

        UserRoleDAOExample urde = new UserRoleDAOExample();
        UserRoleDAOExample.Criteria urdecriteria = urde.createCriteria();
        urdecriteria.andIduserEqualTo(userRoleDAO.getIduser());
        urdecriteria.andIdroleEqualTo(userRoleDAO.getIdrole());
        userRoleDAOMapper.deleteByExample(urde);

        JSONObject obj = new JSONObject();
        obj.put("status","用户删除权限成功");
        return obj.toString();
    }
}
