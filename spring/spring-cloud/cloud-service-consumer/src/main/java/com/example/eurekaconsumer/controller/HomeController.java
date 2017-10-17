package com.example.eurekaconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @RequestMapping()
    public String home(){
        StringBuilder html=new StringBuilder();

        html.append("<a href='demo/ribbon-words'>普通ribbon-words</a><br>");
        html.append("<a href='demo/hystrix-words'>hystrix-words</a><br>");

        return  html.toString();
    }
}
