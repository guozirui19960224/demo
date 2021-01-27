package com.guozr.demo.designpatterm.subclass.factorymethod.idcard;

import com.guozr.demo.designpatterm.subclass.factorymethod.framework.Product;

/**
 * @ClassName IDCard
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/2 17:24
 **/
public class IDCard extends Product {

    private String owner;

    private int code = 100;

    IDCard(String owner,int code) {
        System.out.println("制作"+owner+"("+code+")"+"的ID卡");
        this.owner = owner;
        this.code = code;
    }

    @Override
    public void use() {
        System.out.println("使用"+owner+"("+code+")"+"的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public int getCode() {
        return code;
    }
}
