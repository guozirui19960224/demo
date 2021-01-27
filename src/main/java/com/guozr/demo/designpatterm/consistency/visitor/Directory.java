package com.guozr.demo.designpatterm.consistency.visitor;

import com.guozr.demo.designpatterm.consistency.visitor.exception.FileTreatementException;
import com.guozr.demo.designpatterm.consistency.visitor.inter.Entry;
import com.guozr.demo.designpatterm.consistency.visitor.inter.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Directory
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 14:59
 **/
public class Directory extends Entry {

    private String name;
    private ArrayList dir = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        /*int size = 0;
        Iterator iterator = dir.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            size += entry.getSize();
        }
        return size;*/
        SizeVisitor sizeVisitor = new SizeVisitor();
        accept(sizeVisitor);
        return sizeVisitor.getSize();
    }

    @Override
    public Iterator iterator() throws FileTreatementException {
        return dir.iterator();
    }

    @Override
    public Entry add(Entry entry){
        dir.add(entry);
        return this;
    }

}
