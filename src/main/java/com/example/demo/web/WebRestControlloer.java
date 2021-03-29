package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestControlloer {

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }
}
