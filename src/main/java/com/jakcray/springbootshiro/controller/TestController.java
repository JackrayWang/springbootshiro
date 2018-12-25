package com.jakcray.springbootshiro.controller;

import com.jakcray.springbootshiro.mybatisutils.dao.UserDAO;
import com.jakcray.springbootshiro.mybatisutils.mapper.UserDAOMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @Autowired
    UserDAOMapper userDAOMapper;

    private static final Logger logger = LoggerFactory.getLogger(TestController.class.getName());

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String Test(){

//        UserDAO userDAO = userDAOMapper.selectByPrimaryKey("12345");
//
//        logger.info("success");


//        System.out.println(userDAO.getEmail());
//
//        System.out.println("success");

        return "/sad";
    }

}
