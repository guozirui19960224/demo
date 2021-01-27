package com.guozr.demo.designpatterm.adaptive.adapter.inter;

/**
 * @ClassName Banner
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/24 11:16
 **/
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("("+string+")");
    }

    public void showWithAster(){
        System.out.println("*"+string+"*");
    }
}
