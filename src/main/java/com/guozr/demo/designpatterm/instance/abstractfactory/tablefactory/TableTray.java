package com.guozr.demo.designpatterm.instance.abstractfactory.tablefactory;

import com.guozr.demo.designpatterm.instance.abstractfactory.factory.Item;
import com.guozr.demo.designpatterm.instance.abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * @ClassName TableTray
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/10 10:48
 **/
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width=\"100%\" border=\"1\"><tr>");
        buffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\""+ tray.size() + "\">" +
                "<b> " + caption + "</b></td>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</tr></table>");
        buffer.append("</td>");
        return buffer.toString();
    }
}
