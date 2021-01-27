package com.guozr.demo.designpatterm.accessstructure.visitor.inter;

import com.guozr.demo.designpatterm.accessstructure.visitor.exception.FileTreatementException;

import java.util.Iterator;

/**
 * @ClassName Entry
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 14:58
 **/
public abstract class Entry implements Element {

    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatementException {
        throw new FileTreatementException();
    }
    public Iterator iterator() throws FileTreatementException {
        throw new FileTreatementException();
    }

    @Override
    public String toString() {
        return getName() + "("+getSize()+")";
    }
}
