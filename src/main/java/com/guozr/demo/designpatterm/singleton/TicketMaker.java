package com.guozr.demo.designpatterm.singleton;

/**
 * @ClassName TicketMaker
 * @Description TODO
 * @Author guozr
 * @Date 2020/9/9 15:35
 **/
public class TicketMaker {

    private int ticket = 1000;

    public int getNextTicketNumber(){
        return ticket++;
    }
}
