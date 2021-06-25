package com.guozr.demo.service;

import com.guozr.demo.entity.Demo;
import com.guozr.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : guozr
 * @date : 2021/5/13 09:19
 */
@Service("demoService")
public class DemoService {
    @Autowired
    DemoMapper demoMapper;

    public void insertDemo(Demo demo) {
        demoMapper.insertDemo(demo);
    }

    public void updateDemo(Demo demo) {
        demoMapper.updateDemo(demo);
    }
}
