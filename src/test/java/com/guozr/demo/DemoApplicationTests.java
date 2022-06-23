package com.guozr.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        /*List<String> list = new ArrayList();
        list.add("8");
        list.add("9");
        String newStr = list.stream().collect(Collectors.joining(","));
        System.out.println(newStr);*/

        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(new Date());
        sdf.format(new Date());*/

        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.MILLISECOND, 0);
        System.out.println((cal.getTimeInMillis() - System.currentTimeMillis()) / 1000);
    }

}
