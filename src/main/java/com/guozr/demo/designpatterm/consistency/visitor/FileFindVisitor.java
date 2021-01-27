package com.guozr.demo.designpatterm.consistency.visitor;

import com.guozr.demo.designpatterm.consistency.visitor.inter.Entry;
import com.guozr.demo.designpatterm.consistency.visitor.inter.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName FileFindVisitor
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/26 17:01
 **/
public class FileFindVisitor extends Visitor {

    private String findStr;
    private ArrayList findList = new ArrayList();

    public FileFindVisitor(String findStr) {
        this.findStr = findStr;
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(findStr)){
            findList.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
    }

    public Iterator getFoundFiles() {
        return findList.iterator();
    }
}
