package com.guozr.demo.designpatterm.bridge;

import com.guozr.demo.designpatterm.bridge.impl.DisplayImpl;

/**
 * @ClassName StringDisPlayImpl
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/19 17:02
 **/
public class StringDisPlayImpl extends DisplayImpl {

    private String string;
    private int width;

    public StringDisPlayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|"+string +"|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
