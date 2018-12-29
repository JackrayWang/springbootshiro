package com.jakcray.springbootshiro.manage;

import com.alibaba.fastjson.JSONObject;
import com.jakcray.springbootshiro.mybatisutils.dao.PermissionDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.PermissionDAOExample;
import com.jakcray.springbootshiro.mybatisutils.dao.RoleDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.RoleDAOExample;
import com.jakcray.springbootshiro.mybatisutils.mapper.PermissionDAOMapper;
import com.jakcray.springbootshiro.mybatisutils.mapper.RoleDAOMapper;
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
public class PermissionController {

    @Autowired
    PermissionDAOMapper permissionDAOMapper;

    private static final Logger logger = LoggerFactory.getLogger(PermissionController.class.getName());

    //查询管理员权限
    @RequestMapping(value = "/getManagerPermission" ,method = RequestMethod.POST)
    @ResponseBody
    public String getManagerPermission(){
        PermissionDAOExample pde = new  PermissionDAOExample();
        pde.createCriteria().andIdpermissionIsNotNull();
        List<PermissionDAO> permissionDAOS = permissionDAOMapper.selectByExample(pde);

        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",permissionDAOS);
        return obj.toString();
    }


    //增加管理员权限
    @RequestMapping(value = "/managerPermissionAdd" ,method = RequestMethod.POST)
    @ResponseBody
    public String managerPermissionAdd(@RequestBody PermissionDAO permissionDAO){
        logger.info("=====>ppppppppppppp<=====");

        permissionDAO.setIdpermission(UUID.randomUUID().toString());
        permissionDAO.setAddtime(new Date());
        permissionDAO.setTs(new Date());
        permissionDAOMapper.insert(permissionDAO);
        JSONObject obj=new JSONObject();
        obj.put("status","增加权限成功");
        return obj.toString();
    }

    //删除管理员权限
    @RequestMapping(value = "/managerPermissionDelete" ,method = RequestMethod.POST)
    @ResponseBody
    public String managerPermissionDelete(@RequestBody PermissionDAO permissionDAO){
        logger.info("======>permissionDAO<======");
        permissionDAOMapper.deleteByPrimaryKey(permissionDAO.getIdpermission());
        JSONObject obj=new JSONObject();
        obj.put("status","删除权限成功");
        return obj.toString();
    }

    //编辑管理员权限
    @RequestMapping(value = "/managerPermissionEdit" ,method = RequestMethod.POST)
    @ResponseBody
    public String managerPermissionEdit(PermissionDAO permissionDAO){

        permissionDAO.setTs(new Date());
        permissionDAOMapper.updateByPrimaryKeySelective(permissionDAO);

        JSONObject obj=new JSONObject();
        obj.put("status","修改权限成功");
        return obj.toString();
    }


}
