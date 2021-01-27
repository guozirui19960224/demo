package com.guozr.demo.designpatterm.separate.bridge;

import com.guozr.demo.designpatterm.separate.bridge.impl.DisplayImpl;

/**
 * @ClassName IncreaseDisplay
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/26 11:58
 **/
public class IncreaseDisplay extends CountDisplay {

    private int step;

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level){
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
