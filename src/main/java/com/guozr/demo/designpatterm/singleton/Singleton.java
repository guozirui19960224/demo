package com.guozr.demo.designpatterm.singleton;

/**
 * @ClassName Singleton
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/9 14:43
 **/
public class Singleton {

    private static Singleton singleton = new Singleton();

    public Singleton() {
        System.out.println("----Singleton----");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
