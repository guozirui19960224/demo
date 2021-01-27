package com.guozr.demo.designpatterm.accessstructure.chainofresponsibility;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName Support
 * @Description TODO
 * @Author guozr
 * @Date 2021/1/27 14:44
 **/
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble){
        //递归
        /*if (resolve(trouble)){
            done(trouble);
        }else if(next != null){
            next.support(trouble);
        }else {
            fail(trouble);
        }*/
        //循环
        for (Support support = this;true;support =support.next) {
            if (support.resolve(trouble)){
                support.done(trouble);
                break;
            }else if (support.next == null){
                support.fail(trouble);
                break;
            }
        }
    }

    private void done(Trouble trouble) {
        System.out.println(trouble+" is resolved by "+this.name+".");
    }

    private void fail(Trouble trouble) {
        System.out.println(trouble+" not be resolved");
    }

    //限制外部使用support方法，分包的时候显示效果
    protected abstract boolean resolve(Trouble trouble);
}
