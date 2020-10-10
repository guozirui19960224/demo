package com.guozr.demo.designpatterm.abstractfactory.factory;

import java.util.ArrayList;

/**
 * @ClassName Tray
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:28
 **/
public abstract class Tray extends Item{

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        tray.add(item);
    }
}
