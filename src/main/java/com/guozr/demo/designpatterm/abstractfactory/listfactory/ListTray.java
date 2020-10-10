package com.guozr.demo.designpatterm.abstractfactory.listfactory;

import com.guozr.demo.designpatterm.abstractfactory.factory.Item;
import com.guozr.demo.designpatterm.abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * @ClassName ListTray
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:29
 **/
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</li>\n");
        buffer.append("</ul>\n");
        return buffer.toString();
    }
}
