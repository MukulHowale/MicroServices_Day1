package com.example.limitsservice.controller;

import com.example.limitsservice.bean.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private configuration configuration;

    @GetMapping("/limits")
    public Limits retriveLimits(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
