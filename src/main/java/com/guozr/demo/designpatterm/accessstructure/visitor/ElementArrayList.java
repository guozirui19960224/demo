package com.guozr.demo.designpatterm.accessstructure.visitor;

import com.guozr.demo.designpatterm.accessstructure.visitor.inter.Element;
import com.guozr.demo.designpatterm.accessstructure.visitor.inter.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName ElementArrayList
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/27 11:07
 **/
public class ElementArrayList extends ArrayList implements Element {

    @Override
    public void accept(Visitor visitor) {
        Iterator iterator = this.iterator();
        while (iterator.hasNext()){
            Element element = (Element)iterator.next();
            element.accept(visitor);
        }
    }
}
