package com.jakcray.springbootshiro.manage;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 接受返回页面
 */
@Controller
public class UserViewController {

    private static final Logger logger = LoggerFactory.getLogger(UserViewController.class.getName());

    //获取新增管理员的新增用户界面
    @RequestMapping(value = "/managerole",method = RequestMethod.GET)
    public String managerole(){
        logger.info("=======>managerole<========");
        return "/manage/managerole";
    }

    //获取新增管理员的新增用户界面
    @RequestMapping(value = "/managerpermission",method = RequestMethod.GET)
    public String manageauth(){
        logger.info("=======>managerpermission<========");
        return "/manage/managerpermission";
    }

    //获取新增管理员的新增用户界面
    @RequestMapping(value = "/rolesetter",method = RequestMethod.GET)
    public String rolesetter(Model model, @RequestParam String username){
        logger.info("=======>rolesetter<========"+username);
        model.addAttribute("iduser",username);
        return "/manage/rolesetter";
    }



}
