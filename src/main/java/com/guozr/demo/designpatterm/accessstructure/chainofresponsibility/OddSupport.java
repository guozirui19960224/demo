package com.guozr.demo.designpatterm.accessstructure.chainofresponsibility;

/**
 * @ClassName OddSupport
 * @Description 解决奇数编号
 * @Author guozr
 * @Date 2021/1/27 14:45
 **/
public class OddSupport extends Support{

    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1){
            return true;
        }
        return false;
    }
}
