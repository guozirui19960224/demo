package com.guozr.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : guozr
 * @date : 2021/5/19 16:41
 */
@FeignClient(value = "omsWeb")
public interface FeignService {
    @RequestMapping("/omsWeb/testFeign")
    String health();
}
