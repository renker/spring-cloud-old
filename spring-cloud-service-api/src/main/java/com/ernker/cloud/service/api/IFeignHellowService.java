package com.ernker.cloud.service.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("feign")
public interface IFeignHellowService {
	@RequestMapping(value="hellow",method=RequestMethod.GET)
	public String hellow(@RequestParam("name")String name);
}
