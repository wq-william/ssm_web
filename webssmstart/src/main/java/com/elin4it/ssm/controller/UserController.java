package com.elin4it.ssm.controller;

import com.elin4it.ssm.pojo.User;
import com.elin4it.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 烽 on 2015/7/11.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //service类
    @Autowired
    UserService userService;

    /**
     * 查找所用用户控制器方法
     * @return
     * @throws Exception
     */
    @RequestMapping("/k")
    public ModelAndView findUser()throws Exception{
        ModelAndView modelAndView = new ModelAndView();

        //调用service方法得到用户列表
        List<User> users = userService.findUser();
        for (User user : users) {
            System.out.println("wq 0703 user:"+user);
        }

        //将得到的用户列表内容添加到ModelAndView中
        modelAndView.addObject("users",users);
        //设置响应的jsp视图
        modelAndView.setViewName("findUser");

        return modelAndView;
    }


    @RequestMapping("/findAppUser")
    public @ResponseBody List<User> findAppUser()throws Exception{
        //调用service方法得到用户列表
        List<User> users = userService.findUser();
        for (User user : users) {
            System.out.println("wq 0703 user:"+user);
        }
        return users;
    }
}