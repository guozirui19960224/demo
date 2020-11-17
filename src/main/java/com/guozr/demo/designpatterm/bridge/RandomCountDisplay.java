package com.guozr.demo.designpatterm.bridge;

import com.guozr.demo.designpatterm.bridge.impl.DisplayImpl;

import java.util.Random;

/**
 * @ClassName RandomCountDisplay
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/26 11:32
 **/
public class RandomCountDisplay extends CountDisplay {
    private Random random = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    //显示字符串若干次
    @Override
    public void multiDisplay(int times) {
        super.multiDisplay(random.nextInt(times));
    }
}
