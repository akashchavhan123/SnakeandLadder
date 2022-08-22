package corejavaassignment;

import java.util.Random;

public class Flipcoin {

        public static void main(String[] args) {
            int head = 0;
            int tail = 0;

            for (int i = 1; i <= 10; i++) {
                int coinFlip = (int) Math.round(Math.random());
                System.out.println("Coin Flip Value = "+coinFlip);

                if(coinFlip < 0.5) {
                    tail++;
                }
                else {
                    head++;
                }

            }
            System.out.println("TailCount:"+tail);
            System.out.println("HeadCount:"+head);

            int PercentageTail = (tail * 100) / 10;
            int PercentageHead = (head * 100) / 10;

            System.out.println("The Percentage of Tails is : " + PercentageTail+"%");
            System.out.println("The Percentage of Heads is : " + PercentageHead+"%");
        }
}
