package com.guozr.demo.designpatterm.accessstructure.visitor;

import com.guozr.demo.designpatterm.accessstructure.visitor.inter.Entry;
import com.guozr.demo.designpatterm.accessstructure.visitor.inter.Visitor;

/**
 * @ClassName File
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 14:58
 **/
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
