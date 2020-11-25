package com.xunao.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: abu
 * @version: 1.0
 * @since: 2020/11/25 17:36
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String say(){
       return restTemplate.getForEntity("http://localhost:8081/user/list", String.class).getBody();
    }
}
