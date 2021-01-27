package com.guozr.demo.designpatterm.accessstructure.chainofresponsibility;

/**
 * @ClassName LimitSupport
 * @Description 处理编号小于指定编号
 * @Author guozr
 * @Date 2021/1/27 14:45
 **/
public class LimitSupport extends Support{
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit){
            return true;
        }
        return false;
    }
}
