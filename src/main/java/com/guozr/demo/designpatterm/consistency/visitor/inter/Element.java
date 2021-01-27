package com.guozr.demo.designpatterm.consistency.visitor.inter;

/**
 * @ClassName Element
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 14:58
 **/
public interface Element{

    public abstract void accept(Visitor visitor);

}
