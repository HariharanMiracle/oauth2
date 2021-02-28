package com.darkdevil.oauth2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PathController {

    @RequestMapping("TestString")
    public @ResponseBody String testString(){
        return "testing";
    }

    @RequestMapping({"/", "/home"})
    public String home() {
        return "home";
    }

}
