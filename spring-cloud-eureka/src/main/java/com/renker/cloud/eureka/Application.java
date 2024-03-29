package com.renker.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 注册中心服务开启
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
