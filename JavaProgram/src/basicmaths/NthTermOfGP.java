package basicmaths;

import java.util.Scanner;

public class NthTermOfGP {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ar = sc.nextInt();
        int n = sc.nextInt();
        int r = ar/a;

        System.out.println(a*(int)Math.pow(r,n-1));
    }
}
