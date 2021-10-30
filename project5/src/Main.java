/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

/*
@Author buraktokses
 */
public class Main {
    public static void main(String[] args) {
	    int number = 2520, counter = 21, total = 0;
        boolean check = false;

        while (!check) {
            for (int i = 1; i <= 20; i++) {
                if (counter%i != 0) {
                    check = false;
                    break;
                }
                if (counter%i == 0) {
                    check =  true;
                    total = counter;
                }
            }
            counter++;
        }
        System.out.println("Number: " + total);
    }
}
