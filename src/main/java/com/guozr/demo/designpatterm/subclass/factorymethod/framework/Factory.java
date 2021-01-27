package com.guozr.demo.designpatterm.subclass.factorymethod.framework;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/2 17:16
 **/
public abstract class Factory {

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

    public final Product create(String owner){
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }
}
