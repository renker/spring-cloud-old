package com.renker.cloud.service;

import javax.annotation.Resource;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowServiceImpl implements IHellowService{

	@Resource
	private DiscoveryClient client;
	
	@RequestMapping("hellow")
	public String hellow(){
		ServiceInstance instance = client.getLocalServiceInstance();
		System.out.println("/hellow host:"+instance.getHost() + ", service_id" + instance.getServiceId());
		return "Hellow World";
	}

}
