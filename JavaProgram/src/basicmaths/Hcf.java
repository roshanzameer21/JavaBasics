package basicmaths;

import java.util.Scanner;

public class Hcf {

    //optimised Euclidean Algorithm
    public static int hcf(int n, int m){
        if(m == 0)
            return n;
        return hcf(m,n%m);
    }
    public static void main(String[] arg){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //Naive approach
        /*int hcf = Math.min(n,m);
        while(hcf>0){
            if(n % hcf == 0 && m % hcf == 0)
                break;
            hcf--;
        }
        System.out.println(hcf);*/

        //euclidean Algorithm
        /*while(n != m){
            if(n > m)
                n -= m;
            else
                m -= n;
        }
        System.out.println(n);*/

        System.out.println(hcf(n,m));
    }
}
