package com.xunao.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: abu
 * @version: 1.0
 * @since: 2020/11/25 16:00
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/list")
    public String getUer() {
        return "8081";
    }
}
