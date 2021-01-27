package com.guozr.demo.designpatterm.separate.strategy;

import java.util.Random;

/**
 * @ClassName WinningStrategy
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/26 15:24
 **/
public class WinningStrategy implements Strategy{
    private Random random;

    //boolean类型默认值false
    private boolean won = false;

    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
