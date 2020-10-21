package com.guozr.demo.designpatterm.bridge;

/**
 * @ClassName Display
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/19 17:02
 **/
public class Display {

    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }



}
