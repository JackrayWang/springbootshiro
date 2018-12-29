package com.jakcray.springbootshiro.manage;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jakcray.springbootshiro.mybatisutils.dao.UserDAO;
import com.jakcray.springbootshiro.mybatisutils.dao.UserDAOExample;
import com.jakcray.springbootshiro.mybatisutils.mapper.UserDAOMapper;
import org.apache.coyote.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 接受返回JSON数据
 */
@Controller
public class UserController {


    @Autowired
    UserDAOMapper userDAOMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class.getName());

    //查询管理员
    @RequestMapping(value = "/getManagers" ,method = RequestMethod.POST)
    @ResponseBody
    public String getManagers(){

        UserDAOExample ude = new UserDAOExample();
        ude.createCriteria().andIduserIsNotNull();
        List<UserDAO> userDAOS = userDAOMapper.selectByExample(ude);
        //现在是查询所有的用户，之后如果有权限设置之后应该查询  对应的部门的用户的管理员
        String s = JSON.toJSONString(userDAOS);
        logger.info(s);

        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",userDAOS);
        return obj.toJSONString();
    }

    //删除管理员
    @RequestMapping(value = "/managersDelete" ,method = RequestMethod.POST)
    @ResponseBody
    public String managersDelete(@RequestBody UserDAO user){
        String iduser = user.getIduser();
        userDAOMapper.deleteByPrimaryKey(iduser);
        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("status", "管理员删除成功");
        logger.info(obj.toString());
        return obj.toJSONString();
    }


    //新增管理员
    @RequestMapping(value = "/managersAdd" ,method = RequestMethod.POST)
    @ResponseBody
    public JSONObject managersAdd(@RequestBody UserDAO user){
        System.out.println("========>增加管理员<=======");
        System.out.println("数据"+JSON.toJSONString(user));
        user.setIduser(UUID.randomUUID().toString());
        user.setAddtime(new Date());
        user.setTs(new Date());
        int insert = userDAOMapper.insert(user);
        JSONObject jo = new JSONObject();
        jo.put("status","管理员新增成功");
        return jo;
    }

    //编辑
    @RequestMapping(value = "/managersEdit" ,method = RequestMethod.POST)
    @ResponseBody
    public JSONObject managersEdit(@RequestBody UserDAO user){
        logger.info("=====>更新<======"+JSON.toJSONString(user));
        user.setTs(new Date());
        userDAOMapper.updateByPrimaryKeySelective(user);

        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("status","更新成功");
        return obj;
    }

}
