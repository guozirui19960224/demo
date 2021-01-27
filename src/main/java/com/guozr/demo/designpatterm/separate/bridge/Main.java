package com.guozr.demo.designpatterm.separate.bridge;

import com.guozr.demo.designpatterm.separate.bridge.impl.CharDisplayImpl;

/**
 * @ClassName Main
 * @Description 桥接
 * @Author guozr
 * @Date 2020/10/19 17:45
 **/
public class Main {
    public static void main(String[] args) {
        /*Display d1 = new Display(new StringDisPlayImpl("display-display"));
        Display d2 = new CountDisplay(new StringDisPlayImpl("display-count"));
        CountDisplay c1 = new CountDisplay(new StringDisPlayImpl("count-count"));
        d1.display();
        d2.display();
        c1.display();
        c1.multiDisplay(5);*/
        /*RandomCountDisplay r = new RandomCountDisplay(new StringDisPlayImpl("random-random"));
        r.multiDisplay(10);*/
        /*CountDisplay c2 = new CountDisplay(new FileDisplayImpl("star.txt"));
        c2.multiDisplay(2);*/
        IncreaseDisplay i1 = new IncreaseDisplay(new CharDisplayImpl('<','*','>'),1);
        IncreaseDisplay i2 = new IncreaseDisplay(new CharDisplayImpl('|','#','-'),3);
        i1.increaseDisplay(4);
        i2.increaseDisplay(6);
    }
}
