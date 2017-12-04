package com.renker.cloud.client.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hellow-service")
public interface FeignHellowService {
	@RequestMapping("hellow")
	public String hellow();
}
