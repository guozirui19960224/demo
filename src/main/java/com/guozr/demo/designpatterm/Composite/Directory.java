package com.guozr.demo.designpatterm.Composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName Directory
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/27 18:02
 **/
public class Directory extends Entry {

    private String name;

    private ArrayList directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry){
        directory.add(entry);
        entry.parent = this;
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();
            entry.printList(prefix + "/" +name);
        }
    }
}
