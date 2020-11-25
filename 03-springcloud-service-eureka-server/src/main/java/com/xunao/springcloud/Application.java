package com.xunao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer //开启Eureka 注册中心
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
