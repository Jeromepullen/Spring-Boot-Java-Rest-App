package com.first.rest.RestApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Index {

    @RequestMapping("/index")
    public String index(){
        return "Hey Cole, I would love to learn more about the DevOps Engineer position at UnitedHealth Group!";
    }
}