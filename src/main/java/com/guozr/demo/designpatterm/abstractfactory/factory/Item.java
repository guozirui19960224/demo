package com.guozr.demo.designpatterm.abstractfactory.factory;

/**
 * @ClassName Item
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:28
 **/
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHtml();
}
