package com.jakcray.springbootshiro.user.controller;


import com.alibaba.fastjson.JSON;
import com.jakcray.springbootshiro.mybatisutils.dao.UserDAO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserLoginController {


    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public String userLogin(@RequestBody UserDAO userDAO){
        System.out.println(JSON.toJSONString(userDAO));
        UsernamePasswordToken token = new UsernamePasswordToken(userDAO.getUsername(), userDAO.getPassword());
        SecurityUtils.getSubject().login(token);
        return "success";
    }
}
