package com.guozr.demo.designpatterm.abstractfactory.tablefactory;

import com.guozr.demo.designpatterm.abstractfactory.factory.Item;
import com.guozr.demo.designpatterm.abstractfactory.factory.Page;
import com.guozr.demo.designpatterm.abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * @ClassName TablePage
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/10 10:48
 **/
public class TablePage extends Page {
    public TablePage(String title, String auther) {
        super(title, auther);
    }

    @Override
    protected String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+ title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width =\"80%\" border=\"3\">\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append("<tr>"+item.makeHtml()+"</tr>");
        }
        buffer.append("</table>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
