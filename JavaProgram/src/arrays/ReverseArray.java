package arrays;

import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        for(int i=0; i<a.size();i++){
            System.out.print(a.get(i));
        }
        for(int j= a.size()-1;j>=0;j--){
            r.add(a.get(j));

        }
        System.out.println("\n");
        for(int i=0; i<r.size();i++){
            System.out.print(r.get(i));
        }
    }
}
