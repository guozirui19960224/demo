package com.guozr.demo.designpatterm.instance.prototype.framework;

/**
 * @ClassName Product
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/9 17:10
 **/
public interface Product extends Cloneable{
    public abstract void use(String s);

    public abstract Product createClone();
}
