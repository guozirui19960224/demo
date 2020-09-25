package com.guozr.demo.designpatterm.prototype;

import com.guozr.demo.designpatterm.prototype.framework.Manager;
import com.guozr.demo.designpatterm.prototype.framework.Product;

/**
 * @ClassName Main
 * @Description 复用
 * @Author guozr
 * @Date 2020/9/11 10:32
 **/
public class Main {

    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message",upen);
        manager.register("warning box",mBox);
        manager.register("slash box",sBox);

        //生成
        Product p1 = manager.create("strong message");
        p1.use("hello");
        Product p2 = manager.create("warning box");
        p2.use("hello");
        Product p3 = manager.create("slash box");
        p3.use("hello");
    }
}
