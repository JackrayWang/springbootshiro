package com.jakcray.springbootshiro.manage;

import com.jakcray.springbootshiro.controller.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class ManageAuthController {


    private static final Logger logger = LoggerFactory.getLogger(LoginController.class.getName());

    @RequestMapping(value = "/menu1",method = RequestMethod.GET)
    public String menu1(){
        logger.info("menu1");
        return "/manage/menu1";
    }
}
