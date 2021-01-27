package com.guozr.demo.designpatterm.accessstructure.chainofresponsibility;

/**
 * @ClassName Trouble
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/27 14:44
 **/
public class Trouble {

    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Trouble{" +
                "number=" + number +
                '}';
    }
}
