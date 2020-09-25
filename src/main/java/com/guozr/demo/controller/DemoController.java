package com.guozr.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/11 17:21
 **/
@RestController
@RequestMapping("/demoController")
public class DemoController {

    @RequestMapping("/heart")
    public String heart(){
        return "success";
    }
}
