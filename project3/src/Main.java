/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */
import java.util.ArrayList;
import java.util.List;
/*
@Author buraktokses
 */
public class Main {
    public static List<Integer> divideList = new ArrayList<>();

    public static void main(String[] args) {
        int divide=2, counter = 0;
        long number = 600851475143L;
        while (true){
            System.out.println("Number: " + number);
            System.out.println("Divide: " + divide);
            if (number%divide==0) {
                number = number/divide;
                if (!divideList.contains(divide)) {
                    divideList.add(divide);
                }
            }else if (number%divide != 0) {
                divide += 1;
                continue;
            }
            if (number == 1) {
                break;
            }
            counter++;
        }
        System.out.println("______________________");
        for (int i = 0; i < divideList.size(); i++) {
            System.out.println(divideList.get(i));
        }

    }

    public static boolean primeCheck(int number) {
        boolean check = true;
        for (int i = number-1; i >= 2; i--) {
            if (number==1) {
                check = false;
                break;
            }
            if (number==2) {
                check = true;
                break;
            }
            if (number%i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
