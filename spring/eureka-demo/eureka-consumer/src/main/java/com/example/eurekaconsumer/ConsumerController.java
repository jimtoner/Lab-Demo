package com.example.eurekaconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/say")
    public String say(){
        String res= restTemplate.getForEntity("http://HELLOSERVICE/words",String.class).getBody();
        return String.format("hello,%s !",res);
    }
}
