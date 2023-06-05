package searching;

public class CountOfElement {

        public static int countOccurrence(int[] arr, int occurrence){
            int first =  FirstOccurrence.firstOccurrence(arr, occurrence);
            if (first == -1)
                return 0;
            return LastOccurrence.lastOccurrence(arr,occurrence) - first + 1;
        }
        public static void main(String[] args){

            int[] sortedArray = {10,10,10,20,30};
            System.out.println(countOccurrence(sortedArray,10));
        }
}


