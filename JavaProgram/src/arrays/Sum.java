package arrays;

public class Sum {


    public static int sum(int[] arr, int n){
        if(n==0){
            return -1;
        }
        int[] dun = new int[n];
        int sum =0;
        for(int i =0;i<n;i++){
            dun[i] = (i + 1)*(i + 1);
        }
        for(int i =0;i<n;i++){
            dun[i] = dun[i] - arr[i];
            sum+=dun[i];
        }

        return sum;
    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2,7,13};
        //System.out.println(arr[5]);
        int k = sum(arr, arr.length);
        System.out.println(k);
    }
}
