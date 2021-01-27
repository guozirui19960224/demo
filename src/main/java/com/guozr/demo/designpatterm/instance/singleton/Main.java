package com.guozr.demo.designpatterm.instance.singleton;

/**
 * @ClassName Main
 * @Description 单例
 * @Author guozr
 * @Date 2020/9/9 15:14
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println("Start--");
        /*Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        if (instance == instance1){
            System.out.println("相同实例");
        }else {
            System.out.println("不同实例");
        }*/
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i%3);
            System.out.println(triple);
        }
        System.out.println("End--");
    }
}
