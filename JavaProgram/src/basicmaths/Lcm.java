package basicmaths;

public class Lcm {

    public static int gcd(int a, int b){
            if(b == 0)
                return a;
            return gcd(b, a%b);
    }
    public static void main(String[] args){
        int a = 4, b = 6;

        //Naive approach
        /*int lcm = Math.max(a,b);
        while (true){
            if(lcm%a == 0 && lcm%b == 0)
                break;
            lcm++;
        }
        System.out.println(lcm);*/

        //optimised solution
        // a*b = gcd(a,b) * lcm (a,b)
        // we find gcd by euclidean algo and solve for lcm
        System.out.println((a*b)/gcd(a,b));
    }
}
