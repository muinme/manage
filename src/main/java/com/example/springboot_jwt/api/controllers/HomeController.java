package com.example.springboot_jwt.api.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping({ "/home" })
    public String home() {
        return "Welcome in Manchester United";
    }

}
