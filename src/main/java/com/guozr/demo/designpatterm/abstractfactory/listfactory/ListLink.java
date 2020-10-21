package com.guozr.demo.designpatterm.abstractfactory.listfactory;

import com.guozr.demo.designpatterm.abstractfactory.factory.Link;

/**
 * @ClassName ListLink
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/27 16:29
 **/
public class ListLink extends Link {

    //该构造函数必须有的原因：java中无法继承构造函数，new对象时会在编译代码时报错
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href = \"" + url + "\">" + caption + "</a></li>\n";
    }
}
