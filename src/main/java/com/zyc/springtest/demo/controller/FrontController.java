package com.zyc.springtest.demo.controller;

import com.zyc.springtest.demo.pojo.Msg;
import com.zyc.springtest.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api")
public class FrontController {

    @Autowired
    UserService userService;

    @GetMapping("/listAllUserInfo")
    @ResponseBody
    public Msg findAllUserInfo(){
        return userService.findAllUserInfo();
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world!";
    }


    public Msg findByUserInfoParameter(){
        return null;
    }


}
