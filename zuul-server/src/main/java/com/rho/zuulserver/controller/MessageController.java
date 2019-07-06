package com.rho.zuulserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
    private final static String INDEX = "index";

    @GetMapping(value = "/")
    public String getPage(){
        return INDEX;
    }
}
