import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> primeList = new ArrayList<>();

    public static void main(String[] args) {
        int primeCounter = 0, finish = 10001, number = 0;
        while(true){
            if (primeCounter==finish) {
                System.out.println(primeList.get(primeCounter-1));
                break;
            }
            if (primeCheck(number)) {
                primeList.add((number));
                primeCounter += 1;
            }
            number++;
        }
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
