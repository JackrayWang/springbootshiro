package com.jakcray.springbootshiro.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class.getName());

    //需要在model里面填写一些基本基本信息
    @RequestMapping(value = "/main",method = RequestMethod.GET)
    public ModelAndView main(){
        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.setViewName("/manage/main");
        return modelAndView;
    }

    //需要在model里面填写一些基本基本信息
    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public ModelAndView wellcome(){
        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.setViewName("/manage/wellcome");
        return modelAndView;
    }

    //需要在model里面填写一些基本基本信息
    @RequestMapping(value = "/menu1",method = RequestMethod.GET)
    public ModelAndView menu1(){
        ModelAndView modelAndView  = new ModelAndView();
        modelAndView.setViewName("/manage/menu1");
        return modelAndView;
    }
}
