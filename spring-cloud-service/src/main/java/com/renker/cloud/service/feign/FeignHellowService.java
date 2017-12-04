package com.renker.cloud.service.feign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class FeignHellowService {
	@RequestMapping("feign/hellow")
	public String hellow(@RequestParam String name){
		return "hellow "+name;
	}
	
}
