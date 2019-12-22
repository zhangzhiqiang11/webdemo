package com.zzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController {
    @RequestMapping("/hello.htm")
    public String hello(){
        return "/WEB-INF/hello.jsp";
    }
}
