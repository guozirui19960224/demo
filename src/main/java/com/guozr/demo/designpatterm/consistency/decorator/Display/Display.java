package com.guozr.demo.designpatterm.consistency.decorator.Display;

/**
 * @ClassName Display
 * @Description 用于显示字符串的抽象类
 * @Author guozr
 * @Date 2020/12/14 15:05
 **/
public abstract class Display {

    public abstract int getColumns();
    public abstract int getRows();
    public abstract String getRowText(int row);
    public final void show(){
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    };
}
