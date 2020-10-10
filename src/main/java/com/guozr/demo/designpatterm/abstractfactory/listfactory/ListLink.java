package com.guozr.demo.designpatterm.abstractfactory.listfactory;

import com.guozr.demo.designpatterm.abstractfactory.factory.Link;

/**
 * @ClassName ListLink
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:29
 **/
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href = \"" + url + "\">" + caption + "</a></li>\n";
    }
}
