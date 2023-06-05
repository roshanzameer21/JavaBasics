package recursion;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int number, int k){
        if(number == 0)
            return k;
        return factorial(number-1,k*number);
    }

    public static void main(String[] roshan){
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt(),1));
    }
}
