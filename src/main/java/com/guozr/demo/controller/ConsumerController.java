package com.guozr.demo.controller;

import com.guozr.demo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author : guozr
 * @date : 2021/5/19 09:27
 */
@RestController
public class ConsumerController {
    @Autowired
    private FeignService feignService;
    @RequestMapping("/demo/health")
    public String health(){
        return feignService.health();
    }
}
