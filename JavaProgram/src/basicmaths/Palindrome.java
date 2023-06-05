package basicmaths;

import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(int number){
        int remainder, result = 0, checkNumber = number;

        while(checkNumber>0){
            remainder = checkNumber % 10;
            result = result * 10 + remainder;
            checkNumber /= 10;
        }
        return result == number;
    }
    public static void main(String[] args){


        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));


    }
}
