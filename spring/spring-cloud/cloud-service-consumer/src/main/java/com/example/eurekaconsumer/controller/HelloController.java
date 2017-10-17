package com.example.eurekaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/words")
    public String say(){
        String res= restTemplate.getForEntity("http://HELLOSERVICE/hello/words",String.class).getBody();
        return String.format("hello,%s !",res);
    }
}
