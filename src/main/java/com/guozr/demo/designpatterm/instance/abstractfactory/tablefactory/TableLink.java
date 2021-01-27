package com.guozr.demo.designpatterm.instance.abstractfactory.tablefactory;

import com.guozr.demo.designpatterm.instance.abstractfactory.factory.Link;

/**
 * @ClassName TableLink
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/10 10:48
 **/
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
