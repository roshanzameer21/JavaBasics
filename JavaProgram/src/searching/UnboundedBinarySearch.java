package searching;

//Searching in infinite sized sorted array
public class UnboundedBinarySearch {

    //Naive Solution - O(position)
    /*public static int infiniteArray(int[] array, int number){
       int i = 0;
       while (true){
           if (array[i] == number) return i;
           if (array[i] > number) return -1;
           i++;
       }
    }*/

    //O(log(position))
    public static int infiniteArray(int[] array, int number){
        if (array[0] == number) return 0;
        int i = 1;
        while (array[i] < number)
            i *= 2;
        if (array[i] == number) return i;
        return BinarySearchRecursive.binarySearchRecursive(array, i/2 + 1, i+1, number);
    }

    public static void main(String[] args){
        int[] infiniteArray = {10,20,45,46,50,51,52,66,67,71,75,80,81,82,85,100,450,500,1000};
        System.out.println(infiniteArray(infiniteArray, 80));
    }
}
