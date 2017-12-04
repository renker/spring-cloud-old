package com.renker.cloud.client;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.renker.cloud.client.feign.FeignHellowService;

@RestController
public class HellowController {
	@Resource
	private RestTemplate restTemplate;
	
	@Resource
	private LocalHellowService localHellowService;
	
	@Resource
	private FeignHellowService feignHellowService;
	
	@RequestMapping("hellow")
	public String hellow(){
		String result = restTemplate.getForEntity("http://hellow-service/hellow", String.class).getBody();
		return result;
	}
	
	@RequestMapping("hystrixHellow")
	public String hystrixHellow(){
		return localHellowService.hystrixHellow();
	}
	
	@RequestMapping("feignHellow")
	public String feignHellow(){
		return feignHellowService.hellow();
	}
}
