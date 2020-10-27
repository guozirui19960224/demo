package com.guozr.demo.designpatterm.strategy;

/**
 * @ClassName Head
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/26 15:23
 **/
public class Hand {

    public static final int HAND_VALUE_GUU = 0;
    public static final int HAND_VALUE_CHO = 1;
    public static final int HAND_VALUE_PAA = 2;

    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static final Hand[] hand = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA)
    };

    private static final String[] name = {
            "石头","剪刀","布"
    };

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }

    private int fight(Hand h){
        //实例只有3个，字段值相等，就是相同的实例
        if (this == h){
            return 0;
        }else if ((this.handValue + 1) % 3 == h.handValue){
            return 1;
        }else {
            return -1;
        }
    }

    public String toSring(){
        return name[handValue];
    }
}
