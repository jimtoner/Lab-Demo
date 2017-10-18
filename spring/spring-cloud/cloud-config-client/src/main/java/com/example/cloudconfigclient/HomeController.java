package com.example.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chris.zhai
 * @since Oct 18,2017
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @Value("${from}")
    private String from;

    @RequestMapping
    public String home(){
        return  "congif data:"+this.from;
    }
}
