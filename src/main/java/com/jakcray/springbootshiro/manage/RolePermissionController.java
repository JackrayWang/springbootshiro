package com.jakcray.springbootshiro.manage;

import com.alibaba.fastjson.JSONObject;
import com.jakcray.springbootshiro.mybatisutils.dao.PermissionDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.PermissionDAOExample;
import com.jakcray.springbootshiro.mybatisutils.dao.RolePermissionDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.RolePermissionDAOExample;
import com.jakcray.springbootshiro.mybatisutils.mapper.PermissionDAOMapper;
import com.jakcray.springbootshiro.mybatisutils.mapper.RolePermissionDAOMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RolePermissionController {

    @Autowired
    private RolePermissionDAOMapper rolePermissionDAOMapper;

    @Autowired
    private PermissionDAOMapper permissionDAOMapper;

    private static final Logger logger = LoggerFactory.getLogger(RolePermissionController.class.getName());

    //查询
    @RequestMapping(value = "/getRolePermissions" ,method = RequestMethod.POST)
    @ResponseBody
    public String getRolePermissions(String idrole){

        RolePermissionDAOExample rpde = new RolePermissionDAOExample();
        RolePermissionDAOExample.Criteria rpdecriteria = rpde.createCriteria();
        rpdecriteria.andIdroleEqualTo(idrole);
        List<RolePermissionDAO> rolePermissionDAOS = rolePermissionDAOMapper.selectByExample(rpde);

        List<String> permList = new ArrayList<String>();
        for(RolePermissionDAO rpd:rolePermissionDAOS){
            String idpermission = rpd.getIdpermission();
            permList.add(idpermission);
        }

        PermissionDAOExample permissionDAOExample = new PermissionDAOExample();
        PermissionDAOExample.Criteria pdecriteria = permissionDAOExample.createCriteria();
        pdecriteria.andIdpermissionIn(permList);
        List<PermissionDAO> permissionDAOS = permissionDAOMapper.selectByExample(permissionDAOExample);

        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",permissionDAOS);

        return obj.toString();
    }

    //增加 角色权限关联
    @RequestMapping(value = "/rolePermissionAdd" ,method = RequestMethod.POST)
    @ResponseBody
    public String rolePermissionAdd(@RequestBody RolePermissionDAO rolePermissionDAO){

        rolePermissionDAO.setAddtime(new Date());
        rolePermissionDAO.setTs(new Date());

        rolePermissionDAOMapper.insert(rolePermissionDAO);

        return  null;
    }


    //删除 角色权限关联
    @RequestMapping(value = "/rolePermissionDelete" ,method = RequestMethod.POST)
    @ResponseBody
    public String rolePermissionDelete(@RequestBody RolePermissionDAO rolePermissionDAO){

        RolePermissionDAOExample rpde = new RolePermissionDAOExample();
        RolePermissionDAOExample.Criteria criteria = rpde.createCriteria();
        criteria.andIdroleEqualTo(rolePermissionDAO.getIdrole());
        criteria.andIdpermissionEqualTo(rolePermissionDAO.getIdpermission());
        rolePermissionDAOMapper.deleteByExample(rpde);
        return  null;
    }

    //编辑 角色权限关联
    @RequestMapping(value = "/rolePermissionEdit" ,method = RequestMethod.POST)
    @ResponseBody
    public String rolePermissionEdit(@RequestBody RolePermissionDAO rolePermissionDAO){

        rolePermissionDAO.setTs(new Date());
        rolePermissionDAOMapper.updateByPrimaryKeySelective(rolePermissionDAO);

        return  null;
    }

}
