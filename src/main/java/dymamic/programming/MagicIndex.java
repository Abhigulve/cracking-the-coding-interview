package dymamic.programming;

/**
 * @author Abhijeet Gulve
 */
public class MagicIndex {

    static int binarySearch(int arr[], int low, int high) {
        if (high >= low) {
            /* low + (high - low)/2; */
            int mid = (low + high) / 2;
            if (mid == arr[mid])
                return mid;
            if (mid > arr[mid])
                return binarySearch(arr, (mid + 1), high);
            else
                return binarySearch(arr, low, (mid - 1));
        }

        return -1;
    }

    //main function
    public static void main(String args[]) {
        int arr[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println("Fixed Point is "
                + binarySearch(arr, 0, n - 1));
    }
}
