package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RightRotateBy_K_Places {

   /* public static int[] rotateOperation(int[] array,int start,int end){
        while (start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public static int[] rotate(int[] arr,int k){
        rotateOperation(arr,k,arr.length-1);
        rotateOperation(arr,k-1,0);
        rotateOperation(arr,arr.length-1,0)          have to complete
        return arr;
    }
*/
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String[] s = br.readLine().split(" ");
        int[] num = new int[n];
        for(int i = 0;i< s.length;i++){
            num[i] = Integer.parseInt(s[i]);
        }

        int k = Integer.parseInt(br.readLine().trim())%n;

    //naive solution
    for(int j = 0;j<k;j++){
        int temp = num[n-1];
        for(int i = n-1;i>0;i--){
            num[i] = num[ i - 1];
        }
        num[0] = temp;
    }

       /* int[] a = rotate(num,k);


        for(int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }*/

        for(int i = 0;i< num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
