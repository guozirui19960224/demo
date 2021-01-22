package com.guozr.demo.designpatterm.Decorator.Border;

import com.guozr.demo.designpatterm.Decorator.Border.Border;
import com.guozr.demo.designpatterm.Decorator.Display.Display;

/**
 * @ClassName UpDownBorder
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 10:55
 **/
public class UpDownBorder extends Border {
    private char borderchar;

    protected UpDownBorder(Display display, char borderchar) {
        super(display);
        this.borderchar = borderchar;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == getRows()-1){
            return makeLine(borderchar,getColumns());
        }else {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine(char borderchar, int columns) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < columns; i++) {
            buf.append(borderchar);
        }
        return buf.toString();
    }
}
