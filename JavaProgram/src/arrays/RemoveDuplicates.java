package arrays;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(4);
        for(int element : a){
       // for(int i = 0; i < a.size(); i++){
            //System.out.print(a.get(i));
            System.out.print(element);
        }

        int res = 1;
        r.add(a.get(0));

        System.out.println("\n");
        for(int i=1; i<a.size(); i++){
            if(!r.contains(a.get(i))) {
                r.add(a.get(i));
                res++;
            }
        }
        System.out.println("\n"+r);
        for(int element: r ){
        //for(int i = 0; i < res; i++){
            //System.out.print(r.get(i));
            System.out.print(element);
        }
    }
}
