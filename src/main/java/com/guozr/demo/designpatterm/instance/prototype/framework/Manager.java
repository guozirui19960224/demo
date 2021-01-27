package com.guozr.demo.designpatterm.instance.prototype.framework;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/9 17:12
 **/
public class Manager {
    private Map showcase = new HashMap();

    public void register(String name,Product product){
        showcase.put(name,product);
    }

    public Product create(String pName){
        Product p = (Product) showcase.get(pName);
        return p.createClone();
    }
}
