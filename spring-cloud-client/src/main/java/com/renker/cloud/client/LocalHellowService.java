package com.renker.cloud.client;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class LocalHellowService {
	@Resource
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod="hystrixHellowFallBack")
	public String hystrixHellow(){
		String result = restTemplate.getForEntity("http://hellow-service/hellow", String.class).getBody();
		return result;
	}
	
	public String hystrixHellowFallBack(){
		return "hystrix fallBack error";
	}
}
