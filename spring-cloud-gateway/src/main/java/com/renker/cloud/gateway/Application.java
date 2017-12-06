package com.renker.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.renker.cloud.gateway.filter.TestZoolFIlter;

@EnableZuulProxy
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public TestZoolFIlter testZoolFIlter(){
		return new TestZoolFIlter();
	}
}
