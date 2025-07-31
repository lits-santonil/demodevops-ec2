package com.demodevops.demodevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Docker + EC2Xxxx! ";
    }

}
