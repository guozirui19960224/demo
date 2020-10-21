package com.guozr.demo.designpatterm.bridge;

/**
 * @ClassName Main
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/19 17:45
 **/
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisPlayImpl("display-display"));
        Display d2 = new CountDisplay(new StringDisPlayImpl("display-count"));
        CountDisplay c1 = new CountDisplay(new StringDisPlayImpl("count-count"));
        d1.display();
        d2.display();
        c1.display();
        c1.multiDisplay(5);
    }
}
