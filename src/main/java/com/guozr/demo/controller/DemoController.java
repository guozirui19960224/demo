package com.guozr.demo.controller;

import com.guozr.demo.entity.Demo;
import com.guozr.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @ClassName DemoController
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/11 17:21
 **/
@RestController
@RequestMapping("/demoController")
public class DemoController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/insertDemo")
    public String insertDemo(){
        Demo demo = new Demo();
        demo.setId(UUID.randomUUID().toString());
        demo.setNum(null);
        demoService.insertDemo(demo);
        return "success";
    }

    @RequestMapping("/updateDemo")
    public String updateDemo(){
        Demo demo = new Demo();
        demo.setId("1234");
        demo.setNum(1);
        demoService.updateDemo(demo);
        return "success";
    }



    @RequestMapping("/heart")
    public String heart(){
        return "success";
    }
}
