/**
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 *
 */

/**
 * @Author buraktokses
 */
public class Main {

    public static void main(String[] args) {
        primeSearcher(2000000L);
    }

    public static void primeSearcher(long number) {
        long total = 0;
        for (int i = 0; i <= number; i++) {
            if (primeCheck(i)) {
                total += i;
            }
        }
        System.out.println("Total: " + total);
    }

    public static boolean primeCheck(int number) {
        boolean check = true;
        if (number==0) {
            return check = false;
        }
        if (number==1) {
            return check = false;
        }
        if (number==2) {
            return check = true;
        }
        for (int i = number-1; i >= 2; i--) {
            if (number%i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
