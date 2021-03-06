package com.xunao.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: abu
 * @version: 1.0
 * @since: 2020/11/25 17:39
 */
@Configuration
public class BeanConfig {

    @LoadBalanced // 负载均衡
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
