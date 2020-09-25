package com.guozr.demo.designpatterm.factorymethod.idcard;

import com.guozr.demo.designpatterm.factorymethod.framework.Factory;
import com.guozr.demo.designpatterm.factorymethod.framework.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName IDCardFactory
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/2 17:29
 **/
public class IDCardFactory extends Factory {

    private Map<Integer, String> productMap = new HashMap();

    private int code = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner,code++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard idCard = (IDCard)product;
        productMap.put(new Integer(idCard.getCode()),idCard.getOwner());
    }

    public Map<Integer, String> getProductMap() {
        return productMap;
    }
}
