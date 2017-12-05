package com.renker.cloud.client.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ernker.cloud.service.api.IFeignHellowService;

@FeignClient("hellow-service")
public interface LocalFeignHellowService extends IFeignHellowService{
}
