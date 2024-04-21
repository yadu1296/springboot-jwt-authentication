package com.myprojects.springbootjwtauthentication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtAuthRestController {

    @GetMapping("/test")
    public String testApi() {
     return "hello world...!!!";
    }
}
