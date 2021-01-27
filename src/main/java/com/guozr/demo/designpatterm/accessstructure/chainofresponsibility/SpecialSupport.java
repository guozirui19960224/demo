package com.guozr.demo.designpatterm.accessstructure.chainofresponsibility;

/**
 * @ClassName SpecialSupport
 * @Description 解决指定编号
 * @Author guozr
 * @Date 2021/1/27 14:45
 **/
public class SpecialSupport extends Support{
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }
        return false;
    }
}
