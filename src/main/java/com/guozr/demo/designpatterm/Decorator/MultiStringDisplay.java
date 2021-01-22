package com.guozr.demo.designpatterm.Decorator;

import java.util.ArrayList;

/**
 * @ClassName MultiStringDisplay
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 11:10
 **/
public class MultiStringDisplay extends Display {
    private ArrayList body = new ArrayList();
    private int columns = 0;
    public void add(String msg){
        body.add(msg);
        updateColumns(msg);
    }

    private void updateColumns(String msg) {
        if (msg.getBytes().length>columns){
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < body.size(); row++) {
            int fills = columns - ((String)body.get(row)).getBytes().length;
            if (fills>0){
                body.set(row,body.get(row)+spaces(fills));
            }
        }
    }

    private String spaces(int fills) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < fills; i++) {
            buffer.append(' ');
        }
        return buffer.toString();
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public int getRows() {
        return body.size();
    }

    @Override
    public String getRowText(int row) {
        return (String)body.get(row);
    }
}
