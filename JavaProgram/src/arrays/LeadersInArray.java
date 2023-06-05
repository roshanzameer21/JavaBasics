package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LeadersInArray {// all other elements right side to a number must be smaller
    public static void main(String[] args) throws Exception {
        //Buffered Reader
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int n = Integer.parseInt(br.readLine().trim());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }


        ArrayList<Integer> list = new ArrayList<>();
        int current_leader = a[n-1];
        list.add(current_leader);
        for(int i = n-2;i>=0;i--){
            if(current_leader < a[i] ){
                current_leader = a[i];
                list.add(current_leader);
            }
        }
        for(int i= list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
