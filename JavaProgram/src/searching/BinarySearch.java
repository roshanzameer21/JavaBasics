package searching;

public class BinarySearch {

    public static int binarySearch(int[] arr,int element) {
        int l = 0;
        int h = arr.length - 1;
        int mid = (l + h) / 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                return i;
            if (arr[mid] > element) {
                h = mid - 1;
            } else
                l = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] a = new int[]{10,20,30,40,50,60};
        System.out.println(binarySearch(a,70));
        }
    }

