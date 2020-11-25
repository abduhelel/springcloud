package com.xunao.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: abu
 * @version: 1.0
 * @since: 2020/11/25 16:00
 */
@RestController
public class UserController {

    @RequestMapping("/user/list")
    public String getUer() {
        return "I,m provider";
    }
}
