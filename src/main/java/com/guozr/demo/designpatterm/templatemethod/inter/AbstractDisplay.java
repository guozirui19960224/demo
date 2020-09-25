package com.guozr.demo.designpatterm.templatemethod.inter;

/**
 * @ClassName AbstractDisplay
 * @Description TODO
 * @Author guozr
 * @Date 2020/8/25 15:08
 **/
public abstract class AbstractDisplay {

    /**
     *  同包或继承类使用，不被无关类使用修饰使用protected
     *
     *  接口不能实现方法（display），所以无法代替该抽象类
     */

     public abstract void open();
     public abstract void print();
     public abstract void close();

     /**
      *  #final 拒绝重写
      */
    public final void display() {
        open();
        for (int i = 0; i< 5 ; i++){
            print();
        }
        close();
    }

}
