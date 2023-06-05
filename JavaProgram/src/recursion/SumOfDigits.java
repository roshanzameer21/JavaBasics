package recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int number, int sum){
        if(number == 0)
            return sum;
        return sumOfDigits(number/10, sum + number%10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfDigits(sc.nextInt(),0));
    }

}
