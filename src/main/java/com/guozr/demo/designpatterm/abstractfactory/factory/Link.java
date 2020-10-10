package com.guozr.demo.designpatterm.abstractfactory.factory;

/**
 * @ClassName Link
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:28
 **/
public abstract class Link extends Item{

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
