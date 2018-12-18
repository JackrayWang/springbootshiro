package com.jakcray.springbootshiro.controller;


import com.jakcray.springbootshiro.shiro.service.IShiroSelect;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;


@Controller
public class LoginController {

    @Autowired
    @Qualifier("shiroSelectImpl")
    private IShiroSelect shiroSelectImpl;

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class.getName());
    /**
     * 跳转login页面
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return "/user/add";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(){
        return "/user/delete";
    }

    @RequestMapping(value = "/noAuth",method = RequestMethod.GET)
    public String noAuth(){
        return "/user/noAuth";
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "/login";
    }


    @RequestMapping(value = "/tologin",method = RequestMethod.POST)
    public String login(String username, String password){

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        SecurityUtils.getSubject().login(token);

        return "/manage/main";
    }
}
