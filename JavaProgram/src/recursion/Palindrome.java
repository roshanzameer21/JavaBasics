package recursion;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String string, int start, int end){
        if(start >= end)
            return true;
        return ((string.charAt(start) == string.charAt(end)) && isPalindrome(string, start+1,end-1));
    }

    public static void main(String[] roshan){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str, 0 ,str.length() - 1 ));
    }
}
