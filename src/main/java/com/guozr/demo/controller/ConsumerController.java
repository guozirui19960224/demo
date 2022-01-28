package com.guozr.demo.controller;

import com.guozr.demo.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : guozr
 * @date : 2021/5/19 09:27
 */
//@RestController
public class ConsumerController {
    @Autowired
    private FeignService feignService;
    @RequestMapping("/demo/health")
    public String health(){
        return feignService.health();
    }
}
