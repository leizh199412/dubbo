package com.leizhonghua.user.controller;

import com.leizhonghua.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping("/get")
    @ResponseBody
    public String getMessage(){
        return userService.getMessage();
    }
}
