package com.guozr.demo.designpatterm.subclass.templatemethod;

import com.guozr.demo.designpatterm.subclass.templatemethod.inter.AbstractDisplay;

/**
 * @ClassName CharDisplay
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/25 15:10
 **/
public class CharDisplay extends AbstractDisplay {
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
