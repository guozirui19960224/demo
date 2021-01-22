package com.guozr.demo.designpatterm.Decorator.Border;

import com.guozr.demo.designpatterm.Decorator.Border.Border;
import com.guozr.demo.designpatterm.Decorator.Display.Display;

/**
 * @ClassName FullBorder
 * @Description 用于显示上下左右边框的类
 * @Author guozr
 * @Date 2020/12/14 15:10
 **/
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else if (row == display.getRows() + 1){
            return "+"+makeLine('-',display.getColumns())+"+";
        }else {
            return "|"+display.getRowText(row - 1)+"|";
        }

    }

    private String makeLine(char s, int columns) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < columns; i++) {
            stringBuffer.append(s);
        }
        return stringBuffer.toString();
    }
}
