package com.guozr.demo.designpatterm.separate.strategy;

/**
 * @ClassName Strategy
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/26 15:23
 **/
public interface Strategy {

    public abstract Hand nextHand();

    public abstract void study(boolean win);
}
