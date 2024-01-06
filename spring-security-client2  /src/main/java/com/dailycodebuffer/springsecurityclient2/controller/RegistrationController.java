package com.dailycodebuffer.springsecurityclient2.controller;

import com.dailycodebuffer.springsecurityclient2.entity.User;
import com.dailycodebuffer.springsecurityclient2.model.UserModel;
import com.dailycodebuffer.springsecurityclient2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {


    @Autowired
    private UserService userService;

    private ApplicationEventPublisher publisher;

    @PostMapping("/register")
    public String registerUser (@RequestBody UserModel userModel) {
        User user = userService.registerUser(userModel);
        return "Success";
    }
}
