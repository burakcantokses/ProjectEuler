/*
@Author buraktokses
 */
public class Main {

    public static void main(String[] args) {
        c(100,100);
    }

    // Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    public static double c(int x, int y) {
        double a = a(x),b = b(y), c = a-b;
        System.out.println("***************************");
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println("Total: " + c);
        return c;
    }

    // The sum of the squares of the first ten natural numbers is,
    public static double a(int x) {
        double number = 0, total = 0;
        for (int i = 1; i <= x; i++) {
            number = Math.pow(i, 2);
            System.out.println(i+" ^ 2 = " + (number));
            total += number;
        }
        System.out.println("Total: " + total);
        return total;
    }

    // The square of the sum of the first ten natural numbers is,
    public static double b(int x) {
        double number = 0, total = 0;
        for (int i = 1; i <= x; i++) {
            number += i;
        }
        total = Math.pow(number, 2);
        System.out.println("Total: " + total);
        return total;
    }
}
