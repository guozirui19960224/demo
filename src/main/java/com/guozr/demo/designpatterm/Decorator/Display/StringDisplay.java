package com.guozr.demo.designpatterm.Decorator.Display;

import com.guozr.demo.designpatterm.Decorator.Display.Display;

/**
 * @ClassName StringDisplay
 * @Description 用于显示单行字符串的类
 * @Author guozr
 * @Date 2020/12/14 15:08
 **/
public class StringDisplay extends Display {
    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0){
            return string;
        }
        return null;
    }
}
