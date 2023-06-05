package searching;

public class SquareRoot {
    public static int squareRoot(int number){
        int low = 1, high = number, ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            int squareRoot = mid * mid;
            if(squareRoot == number)
                return mid;
            else if (squareRoot > number)
                high = mid - 1;
            else
                low = mid + 1;
                ans = mid;
        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(squareRoot(49));
    }
}
