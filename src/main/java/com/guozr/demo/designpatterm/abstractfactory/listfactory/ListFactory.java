package com.guozr.demo.designpatterm.abstractfactory.listfactory;

import com.guozr.demo.designpatterm.abstractfactory.factory.Factory;
import com.guozr.demo.designpatterm.abstractfactory.factory.Link;
import com.guozr.demo.designpatterm.abstractfactory.factory.Page;
import com.guozr.demo.designpatterm.abstractfactory.factory.Tray;

/**
 * @ClassName ListFactory
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:29
 **/
public class ListFactory extends Factory {


    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
