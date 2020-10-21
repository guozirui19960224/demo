package com.guozr.demo.designpatterm.bridge;

/**
 * @ClassName CountDisplay
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/19 17:02
 **/
public class CountDisplay extends Display{


    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
