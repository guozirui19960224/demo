package com.guozr.demo.designpatterm.adaptive.adapter;

import com.guozr.demo.designpatterm.adaptive.adapter.inter.Banner;
import com.guozr.demo.designpatterm.adaptive.adapter.inter.Print;

/**
 * @ClassName PrintBanner
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/24 11:09
 **/
public class PrintBanner extends /*Banner implements*/ Print {
    private Banner banner;

    public PrintBanner(String string) {
        //super(string);
        this.banner = new Banner((string));
    }

    /*@Override
    public void printWeak(){
        showWithParen();
    }

    @Override
    public void printStrong(){
        showWithAster();
    }*/

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
