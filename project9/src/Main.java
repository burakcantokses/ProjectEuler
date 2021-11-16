import java.util.ArrayList;
import java.util.List;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 *  a^2 + b^2 = c^2
 *  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *
 *  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 *  Find the product abc.
 */

/**
 * @Author buraktokses
 */
public class Main {

    public static void main(String[] args) {
        specialTriangleSearcher(1000);
    }

    public static void specialTriangleSearcher(int number) {
        int a=0,b=0,c=0, total = 0;
        for (int i = 1; i <= number; i++) {
            a = (int)Math.pow(i, 2);
            for (int j = 1; j <= number; j++) {
                b = (int)Math.pow(j, 2);
                for (int k = 1; k <= number; k++) {
                    c = (int)Math.pow(k, 2);
                    if (a+b == c) {
                        if (i + j + k == 1000) {
                            if (k>j && k>i) {
                                if (j>i) {
                                    System.out.println(String.format("Found a:%d b:%d c:%d", a, b, c));
                                    System.out.println(String.format("Pows a:%d+b:%d+c:%d = %d", i, j, k, (i + j + k)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
