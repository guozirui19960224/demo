package com.guozr.demo.designpatterm.accessstructure.visitor;

import com.guozr.demo.designpatterm.accessstructure.visitor.inter.Entry;
import com.guozr.demo.designpatterm.accessstructure.visitor.inter.Visitor;

import java.util.Iterator;

/**
 * @ClassName ListVisitor
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 14:58
 **/
public class ListVisitor extends Visitor {

    private String cuttentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(cuttentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(cuttentdir + "/" + directory);
        String saveDir = cuttentdir;
        cuttentdir = cuttentdir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        cuttentdir = saveDir;
    }
}
