package com.company;

import java.util.Random;

public class Main {

    static int r = 1000;

    static int getRate() {
        int x = (int) ((Math.random() * 100) + 1);

        r = r - x;
        return r;

    }

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        int rate = 0;
        int old_Rate = 0;
        long time = 6 * 1000;
        int count = 0;
        while (r > 0) {

            old_Rate = rate;

            rate = getRate();

            int y = old_Rate - rate;

            int x = (int) (rate * 0.1);

            if (count > 0) {
                count++;
            } else if (x <= y) {
                time = 1 * 1000;
                count++;
                System.out.println("Begin");
            }

            if (count == 6) {
                count = 0;
                System.out.println("End");
                time = 6 * 1000;
            }
            System.out.println(rate + "," + time);

            Thread.sleep(time);
        }
    }
}
