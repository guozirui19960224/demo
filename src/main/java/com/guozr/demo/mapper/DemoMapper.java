package com.guozr.demo.mapper;

import com.guozr.demo.entity.Demo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : guozr
 * @date : 2021/5/13 09:22
 */
@Mapper
@Repository
public interface DemoMapper {
    List<Demo> selectDemoList();

    void insertDemo(Demo demo);

    void updateDemo(Demo demo);
}
