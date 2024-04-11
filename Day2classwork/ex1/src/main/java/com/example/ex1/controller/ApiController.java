package com.example.ex1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.ex1.config.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController {

    @Autowired
    AppConfig app;

    @GetMapping("/path")
    public String getMethodName() {
        return "AppName: "+app.getAppName() +",AppVersion: "+app.getAppVersion();
    }
    
}
