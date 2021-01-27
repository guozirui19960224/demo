package com.guozr.demo.designpatterm.subclass.templatemethod;

import com.guozr.demo.designpatterm.subclass.templatemethod.inter.AbstractDisplay;

/**
 * @ClassName Main
 * @Description 模板
 * @Author guozr
 * @Date 2020/8/25 15:35
 **/
public class Main {

    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');

        AbstractDisplay d2 = new StringDisplay("Hello,world");

        AbstractDisplay d3 = new StringDisplay("你好，世界。");

        d1.display();
        d2.display();
        d3.display();
    }
}
