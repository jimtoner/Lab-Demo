package com.example.eurekaconsumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chris.zhai
 * @since Oct 17,2017
 */
@FeignClient("demoservice")
public interface DemoService {
    @RequestMapping("/demo/words")
    String words();
}
