/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
import java.util.ArrayList;
import java.util.List;

/*
@Author buraktokses
 */
public class Main {

    public static List<Integer> palindromicList = new ArrayList<>();
    public static void main(String[] args) {
        int palindromic = 0, test = 0;
        String reversed = "", original = "";
        for (int i = 1; i <= 999; i++) {
            for (int j = 1; j < 999; j++) {
                test = i*j;
                original = String.valueOf(test);
                reversed = reverse(String.valueOf(test));
                if (reversed.equalsIgnoreCase(original)) {
                    if (String.valueOf(i).length() == 3 && String.valueOf(j).length() == 3) {
                        System.out.println("found: " + test + " - " + i + " * " + j);
                        palindromic = test;
                        palindromicList.clear();
                        palindromicList.add(i);
                        palindromicList.add(j);
                    }
                }
            }
        }

        System.out.println("*************************************************");
        System.out.println(palindromicList.get(0) + " - " + palindromicList.get(1));
        System.out.println("Palindromic Number: " + palindromic);
        System.out.println("*************************************************");
    }

    public static String reverse(String s) {
        String reversed = "";
        int length = s.length();
        for (int i = length-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }
}
