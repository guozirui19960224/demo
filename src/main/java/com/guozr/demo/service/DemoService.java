package com.guozr.demo.service;

import com.guozr.demo.entity.Demo;
import com.guozr.demo.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.JedisCluster;

/**
 * @author : guozr
 * @date : 2021/5/13 09:19
 */
@Service("demoService")
public class DemoService {
    @Autowired
    private JedisCluster jedisCluster;

    @Autowired
    DemoMapper demoMapper;

    @Transactional(rollbackFor = Exception.class)
    public void insertDemo(Demo demo) {
        demoMapper.insertDemo(demo);
        jedisCluster.set("demo"+demo.getId(),demo.toString());
    }

    public void updateDemo(Demo demo) {
        demoMapper.updateDemo(demo);
    }
}
