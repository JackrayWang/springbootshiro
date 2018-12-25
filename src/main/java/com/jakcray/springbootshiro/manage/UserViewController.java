package com.jakcray.springbootshiro.manage;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 接受返回页面
 */
@Controller
public class UserViewController {

    private static final Logger logger = LoggerFactory.getLogger(UserViewController.class.getName());

    //获取新增管理员的新增用户界面
    @RequestMapping(value = "/addmanager",method = RequestMethod.GET)
    public String index(){
        logger.info("=======>test<========");
        return "/manage/addtemplate";
    }

}
