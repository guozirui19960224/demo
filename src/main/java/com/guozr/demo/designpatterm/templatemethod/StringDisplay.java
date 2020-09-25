package com.guozr.demo.designpatterm.templatemethod;

import com.guozr.demo.designpatterm.templatemethod.inter.AbstractDisplay;

/**
 * @ClassName StringDisplay
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/25 15:16
 **/
public class StringDisplay extends AbstractDisplay {
    private String s;

    private int width;

    public StringDisplay(String s) {
        this.s = s;
        this.width = s.getBytes().length;
    }

    @Override
    public void open() {
       printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+s+"|");
    }

    @Override
    public void close() {
       printLine();
    }

    public void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
