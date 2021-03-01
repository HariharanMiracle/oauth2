package com.darkdevil.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HelloResource {

    @GetMapping("/")
    public String hello(){
        return "home";
    }

    @GetMapping("/user")
    public String user(Principal principal){
        System.out.println(principal.toString());
        return "user";
    }

}
