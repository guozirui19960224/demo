package com.guozr.demo.designpatterm.consistency.visitor.inter;

import com.guozr.demo.designpatterm.consistency.visitor.Directory;
import com.guozr.demo.designpatterm.consistency.visitor.File;

/**
 * @ClassName Visitor
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/22 11:28
 **/
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
