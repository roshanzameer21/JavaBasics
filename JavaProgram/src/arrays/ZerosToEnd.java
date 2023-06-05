package arrays;

import java.util.ArrayList;

public class ZerosToEnd {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(3);
        list.add(0);
        int count = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) == 0) {
                list.set(list.get(count),list.get(count+1));
                count++;
            }
        }
        System.out.println(count);
        for(int ele:list){
            System.out.print(ele);
        }
    }
}
