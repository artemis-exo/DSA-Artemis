package BinarySearch;

public class CeilInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 12, 16, 19, 24, 26};
        int target = 6;
      // System.out.println(Ceil(arr, target));
        System.out.println(binarySearch(arr,target));

    }

    static int Ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target == arr[mid]) {
                return mid;
            }

        }
        return arr[mid];
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid=(start+end)/2; - it might be possible that (start+end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else { // ans found
                return mid;
            }
        }
        return arr[start];
    }
}
