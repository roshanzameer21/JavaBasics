package searching;

public class BinarySearchRecursive {
    public static int binarySearchRecursive(int[] arr,int low, int high, int element) {

        int mid = (low + high)/2;
        if(low > high) return -1;
        if(arr[mid] == element)
            return mid;
        else if(arr[mid] > element)
            return binarySearchRecursive(arr, low, mid - 1, element);
        else if(arr[mid] < element)
            return binarySearchRecursive(arr, mid + 1, high, element);
        else
            return -1;
    }

    public static void main(String[] args){
        int[] a = new int[]{10,20,30,40,50,60};
        int l = 0;
        int h = a.length - 1;
        System.out.println(binarySearchRecursive(a, l, h, 50));
    }
}
