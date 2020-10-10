package com.guozr.demo.designpatterm.abstractfactory.tablefactory;

import com.guozr.demo.designpatterm.abstractfactory.factory.Factory;
import com.guozr.demo.designpatterm.abstractfactory.factory.Link;
import com.guozr.demo.designpatterm.abstractfactory.factory.Page;
import com.guozr.demo.designpatterm.abstractfactory.factory.Tray;

/**
 * @ClassName TableFactory
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/10 10:46
 **/
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title,author);
    }
}
