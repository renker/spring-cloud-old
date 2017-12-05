package com.renker.cloud.service.feign;

import org.springframework.web.bind.annotation.RestController;

import com.ernker.cloud.service.api.IFeignHellowService;

@RestController
public class FeignHellowService implements IFeignHellowService{

	public String hellow5(String name) {
		return "hellow5 "+name;
	}
	
}
