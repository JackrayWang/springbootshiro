package com.jakcray.springbootshiro.controller;

//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.UsernamePasswordToken;
//import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class LoginController {


    /**
     * 跳转login页面
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "/login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, Model model){

//        UsernamePasswordToken upt = new UsernamePasswordToken();
//
//        Subject subject = SecurityUtils.getSubject();
//
//        subject.login(upt);




        return "index";
    }


}
