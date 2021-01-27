package com.guozr.demo.designpatterm.accessstructure.chainofresponsibility;

/**
 * @ClassName Main
 * @Description 责任链
 * @Author guozr
 * @Date 2021/1/27 14:40
 **/
public class Main {

    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob",100);
        Support charlie = new SpecialSupport("Charlie",429);
        Support diana = new LimitSupport("Diana",200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred",300);
        // 责任链形成
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        for (int i = 0; i < 500; i+=33) {
            alice.support(new Trouble(i));
        }
    }
}
