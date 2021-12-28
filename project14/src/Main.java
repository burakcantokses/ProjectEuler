/**
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * @Author burakcantokses
 */
public class Main {

    public static void main(String[] args) {
        int max = 0;
        int number = 0;
        for (int i = 13; i <1000000 ; i++) {
            if (collatzSize(i)>max) {
                max = collatzSize(i);
                number = i;
            }
        }
        System.out.println("Found: "+number);
    }

    public static int[] findCollatz(int number) {
        List<Integer> list = new ArrayList<>();
        list.add(number);
        while(number!=1) {
            if (number%2 == 0) {
                number = number/2;
            } else {
                number = (number*3) + 1;
            }
            list.add(number);
        }
        int[] collatz = new int[list.size()];
        for (int i = 0; i < collatz.length; i++) {
            collatz[i] = list.get(i);
        }
        return collatz;
    }

    public static int collatzSize(int number) {
        return findCollatz(number).length;
    }
}
