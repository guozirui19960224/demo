package com.guozr.demo.designpatterm.separate.strategy;

import java.util.Random;

/**
 * @ClassName RandomStrategy
 * @Description TODO
 * @Author guozr
 * @Date 2020/10/27 15:06
 **/
public class RandomStrategy implements Strategy{
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
