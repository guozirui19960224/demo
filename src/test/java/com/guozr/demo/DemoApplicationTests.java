package com.guozr.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        List<String> list = new ArrayList();
        list.add("8");
        list.add("9");
        String newStr = list.stream().collect(Collectors.joining(","));
        System.out.println(newStr);
    }

}
