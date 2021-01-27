package com.guozr.demo.designpatterm.consistency.decorator.Border;

import com.guozr.demo.designpatterm.consistency.decorator.Display.Display;

/**
 * @ClassName Border
 * @Description 用于显示装饰边框的抽象类
 * @Author guozr
 * @Date 2020/12/14 15:08
 **/
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
