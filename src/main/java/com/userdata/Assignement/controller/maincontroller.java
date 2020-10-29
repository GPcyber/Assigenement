package com.userdata.Assignement.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class maincontroller {

    @GetMapping("/login")
    public String getlogin()
    {
        return "login";
    }

    @GetMapping("/user")
    public String getUser()
    {
        return "user.html";
    }

}
