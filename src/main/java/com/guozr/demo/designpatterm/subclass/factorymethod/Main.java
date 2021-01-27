package com.guozr.demo.designpatterm.subclass.factorymethod;

import com.guozr.demo.designpatterm.subclass.factorymethod.framework.Factory;
import com.guozr.demo.designpatterm.subclass.factorymethod.idcard.IDCardFactory;
import com.guozr.demo.designpatterm.subclass.factorymethod.framework.Product;

/**
 * @ClassName Main
 * @Description 工厂
 * @Author guozr
 * @Date 2020/9/3 15:10
 **/
public class Main {

    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("o1");
        Product card2 = factory.create("o2");
        Product card3 = factory.create("o3");
        card1.use();
        card2.use();
        card3.use();
    }
}
