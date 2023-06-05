package recursion;

import java.util.Scanner;

public class RopeCuttingProblem {

    public static int maxRopeCuts(int number, int a, int b, int c){
        if(number == 0)
            return 0;
        if(number < 0)
            return -1;
        int result = Math.max(maxRopeCuts(number-a,a,b,c),
                Math.max(maxRopeCuts(number-b,a,b,c),
                maxRopeCuts(number-c,a,b,c)));
        if(result == -1)
            return -1;
        return result + 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(maxRopeCuts(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
    }
}
