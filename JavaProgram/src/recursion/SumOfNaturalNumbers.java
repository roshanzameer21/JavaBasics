package recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static int sum(int number,int k){
        if(number == 0)
            return k;
        return sum(number-1, k+number);
    }

    public static void main(String[] roshan){
        Scanner sc = new Scanner(System.in);
        System.out.println(sum(sc.nextInt(),0));
    }
}
