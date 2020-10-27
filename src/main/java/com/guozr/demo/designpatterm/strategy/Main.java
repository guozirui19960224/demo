package com.guozr.demo.designpatterm.strategy;

/**
 * @ClassName Main
 * @Description 策略
 * @Author guozr
 * @Date 2020/10/26 15:15
 **/
public class Main {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player player1 = new Player("Taro", new WinningStrategy(seed1));
        //Player player2 = new Player("Hana", new ProbStrategy(seed2));
        Player player2 = new Player("Hana", new RandomStrategy(seed2));
        for (int i = 0; i < 100; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("1win");
                player1.win();
                player2.lose();
            }else if (nextHand2.isStrongerThan(nextHand1)){
                System.out.println("2win");
                player1.lose();
                player2.win();
            }else {
                System.out.println("even");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
