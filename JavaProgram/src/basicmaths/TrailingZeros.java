package basicmaths;

import java.util.Scanner;
public class TrailingZeros {
    public static void factorial(int number) {
        long result = 1;
        if (number == 0)
            System.out.println(1);
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),trailingZeros = 0;
        factorial(n);
        for(int i = 5; i <= n; i *= 5){
            trailingZeros += n/i;
        }
        System.out.println(trailingZeros);
    }
}
/*

public class basicmaths.TrailingZeros {
    public static int factorial(int number) {
        int result = 1;
        if (number == 0)
            return 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int trailingZeros(int factorial) {
        int number = factorial, count = 0;

        while (number % 10 == 0) {
                count++;
                number /= 10;
        }
        return count;
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int factorialNumber = factorial(n);
            System.out.println(factorialNumber);
            System.out.println(trailingZeros(factorialNumber));
        }
    }

*/
