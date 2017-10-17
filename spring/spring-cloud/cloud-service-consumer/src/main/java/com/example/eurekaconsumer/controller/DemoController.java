package com.example.eurekaconsumer.controller;

import com.example.eurekaconsumer.service.DemoService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DemoService demoService;

    /**
     * 普通Ribbon
     * @return
     */
    @RequestMapping("/ribbon-words")
    public String ribbonWords(){
        String res= restTemplate.getForEntity("http://DEMOSERVICE/demo/words",String.class).getBody();
        return String.format("%s !",res);
    }
    /**
     * Hystrix Ribbon
     * @return
     */
    @HystrixCommand(fallbackMethod = "hystrixCallback")
    @RequestMapping("/hystrix-words")
    public String hystrixWords(){
        String res= restTemplate.getForEntity("http://DEMOSERVICE/demo/words",String.class).getBody();
        return String.format("%s !",res);
    }
    public String hystrixCallback(){
        return "hystrix callback when error";
    }

    /**
     * 普通Ribbon
     * @return
     */
    @RequestMapping("/feign-words")
    public String feignWords(){
        String res= demoService.words();
        return String.format("%s !",res);
    }

}
