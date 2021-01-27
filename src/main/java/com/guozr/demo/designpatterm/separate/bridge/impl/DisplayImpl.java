package com.guozr.demo.designpatterm.separate.bridge.impl;

/**
 * @ClassName DisplayImpl
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/19 17:02
 **/
public abstract class DisplayImpl {

    public abstract void rawOpen();

    public abstract void rawPrint();

    public abstract void rawClose();
}
