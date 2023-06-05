package basicmaths;

import java.util.Scanner;

public class DigitsInFactorial {

    public static int factorial(int number){
        int fact = 1;
        for(int i = 1;i<=number;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int digitsInFactorial(int factorial){
        int noOfDigits = 0;
        while (factorial != 0){
            factorial /= 10;
            noOfDigits++;

        }
        return noOfDigits;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int fact = factorial(number);
        System.out.println(fact);
        System.out.println(digitsInFactorial(fact));
    }
}
