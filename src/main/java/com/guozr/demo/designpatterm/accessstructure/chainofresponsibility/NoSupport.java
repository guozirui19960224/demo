package com.guozr.demo.designpatterm.accessstructure.chainofresponsibility;

/**
 * @ClassName NoSupport
 * @Description 不处理
 * @Author guozr
 * @Date 2021/1/27 14:45
 **/
public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}
