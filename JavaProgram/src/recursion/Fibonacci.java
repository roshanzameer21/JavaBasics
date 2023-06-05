package recursion;

import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int number){
        if(number == 0)
            return 0;
        if (number == 1)
            return 1;
        return fibonacci(number-1)+ fibonacci(number-2);
    }

    public static void main(String[] roshan){
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));
    }
}
