package com.jakcray.springbootshiro.manage;

import com.alibaba.fastjson.JSONObject;
import com.jakcray.springbootshiro.mybatisutils.dao.RoleDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.RoleDAOExample;
import com.jakcray.springbootshiro.mybatisutils.dao.UserDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.UserRoleDAO;
import com.jakcray.springbootshiro.mybatisutils.mapper.RoleDAOMapper;
import com.jakcray.springbootshiro.mybatisutils.mapper.UserDAOMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class RoleController {

    @Autowired
    RoleDAOMapper roleDAOMapper;

    @Autowired


    private static final Logger logger = LoggerFactory.getLogger(RoleController.class.getName());

    //查询管理员
    @RequestMapping(value = "/getManagerRole" ,method = RequestMethod.POST)
    @ResponseBody
    public String getManagerRole(){
        RoleDAOExample rde = new RoleDAOExample();
        rde.createCriteria().andIdroleIsNotNull();
        List<RoleDAO> roleDAOS = roleDAOMapper.selectByExample(rde);

        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",roleDAOS);
        return obj.toString();
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/updateRole" ,method = RequestMethod.POST)
    @ResponseBody
    public String updateManagerRole(List<UserRoleDAO> urdLsit){
//        RoleDAOExample rde = new RoleDAOExample();
//        rde.createCriteria().andIdroleIsNotNull();
//        List<RoleDAO> roleDAOS = roleDAOMapper.selectByExample(rde);


        for(UserRoleDAO urd:urdLsit){
            urd.getIduserRole();

            //

        }

        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
//        obj.put("code", 0);
//        obj.put("msg", "");
//        obj.put("count",1000);
//        obj.put("data",roleDAOS);
        return obj.toString();
    }


    //添加 角色
    @RequestMapping(value = "/roleAdd" ,method = RequestMethod.POST)
    @ResponseBody
    public String managerRoleAdd(@RequestBody RoleDAO roleDAO){
        roleDAO.setIdrole(UUID.randomUUID().toString());
        roleDAO.setAddtime(new Date());
        roleDAO.setTs(new Date());
        roleDAOMapper.insert(roleDAO);
        JSONObject obj=new JSONObject();
        obj.put("status","角色添加成功");
        return obj.toString();
    }

    //删除 角色
    @RequestMapping(value = "/roleDelete" ,method = RequestMethod.POST)
    @ResponseBody
    public String managerRoleDelete(@RequestBody RoleDAO roleDAO){
        String idrole = roleDAO.getIdrole();
        roleDAOMapper.deleteByPrimaryKey(idrole);
        JSONObject obj=new JSONObject();
        obj.put("status","角色删除成功");
        return obj.toString();
    }

    //编辑 角色
    @RequestMapping(value = "/roleEdit" ,method = RequestMethod.POST)
    @ResponseBody
    public String managerRoleEdit(@RequestBody RoleDAO roleDAO){
        roleDAO.setTs(new Date());
        roleDAOMapper.updateByPrimaryKeySelective(roleDAO);
        JSONObject obj=new JSONObject();
        obj.put("status","角色修改成功");
        return obj.toString();
    }

    //设置 角色
//    @RequestMapping(value = "/managerRoleSet" ,method = RequestMethod.POST)
//    @ResponseBody
//    public String managerRoleSet(@RequestBody RoleDAO roleDAO){
//
//        return null;
//    }



}
