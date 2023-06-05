package searching;

public class SortedRotatedArray {

    public static int elementSearch(int[] rotatedSortedArray, int elementToFind) {
        int low = 0, high = rotatedSortedArray.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (rotatedSortedArray[mid] == elementToFind)
                return mid;
            if (rotatedSortedArray[low] < rotatedSortedArray[mid]) {//right half sorted
                if ( elementToFind >= rotatedSortedArray[low]  &&  elementToFind < rotatedSortedArray[mid] )
                    high = mid - 1;
                else
                    low = mid + 1;

            } else {//left half sorted
                if ( elementToFind > rotatedSortedArray[mid] && elementToFind <= rotatedSortedArray[high] )
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
        public static void main (String[]args){
            int[] array = {100, 200, 300, 500, 50, 70};
            System.out.println(elementSearch(array, 50));
        }

}

