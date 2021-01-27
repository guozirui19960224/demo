package com.guozr.demo.designpatterm.accessstructure.visitor;

import com.guozr.demo.designpatterm.accessstructure.visitor.inter.Entry;
import com.guozr.demo.designpatterm.accessstructure.visitor.inter.Visitor;

import java.util.Iterator;

/**
 * @ClassName SizeVisitor
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/26 18:35
 **/
public class SizeVisitor extends Visitor {

    private int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
    }
}
