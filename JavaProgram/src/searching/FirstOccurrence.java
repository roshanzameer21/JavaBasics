package searching;

public class FirstOccurrence {

    public static int firstOccurrence(int[] arr, int occurrence){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] > occurrence) {
                high = mid - 1;
            } else if (arr[mid] < occurrence)
                low = mid + 1;
            else{
                if(mid == 0 || arr[mid] != arr[mid - 1])
                    return mid;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[] sortedArray = {10,10,10,20,20,30};
        System.out.println(firstOccurrence(sortedArray,20));
    }
}
