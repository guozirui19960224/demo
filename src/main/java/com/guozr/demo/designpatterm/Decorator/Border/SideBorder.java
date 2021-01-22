package com.guozr.demo.designpatterm.Decorator.Border;

import com.guozr.demo.designpatterm.Decorator.Border.Border;
import com.guozr.demo.designpatterm.Decorator.Display.Display;

/**
 * @ClassName SideBorder
 * @Description 用于只显示左右边框的类
 * @Author guozr
 * @Date 2020/12/14 15:09
 **/
public class SideBorder extends Border {
    private char borderchar;

    public SideBorder(Display display, char borderchar) {
        super(display);
        this.borderchar = borderchar;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderchar+display.getRowText(row)+borderchar;
    }
}
