package com.guozr.demo.designpatterm.abstractfactory.listfactory;

import com.guozr.demo.designpatterm.abstractfactory.factory.Item;
import com.guozr.demo.designpatterm.abstractfactory.factory.Page;

import java.util.Iterator;

/**
 * @ClassName ListPage
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:29
 **/
public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHtml() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+ title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHtml());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        String string = buffer.toString();
        return string;
    }
}
