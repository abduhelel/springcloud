package com.xunao.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: abu
 * @version: 1.0
 * @since: 2020/11/25 17:36
 */

@RestController
public class WebController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/web/hello")
    public String say() {
//       return restTemplate.getForEntity("http://localhost:8081/user/list", String.class).getBody();
        // 可以直接使用服务名称来调用
        return restTemplate.getForEntity("http://01-SPRINGCLOUD-SERVICE-PROVIDER/user/list", String.class).getBody();
    }
}
