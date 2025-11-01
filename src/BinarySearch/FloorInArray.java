package BinarySearch;

public class FloorInArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,8,9,14,17,19};
        int tar=15;
        System.out.println(floor1(arr,tar));
        System.out.println(floor2(arr,tar));
        System.out.println(floor3(arr,tar));

    }
    static int floor1(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target==arr[mid]){
                return arr[mid];
            }
        }
        return arr[mid-1];
    }

    static int floor3(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
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

    static int floor2(int[] arr, int target){
        int start=0;
        int end= arr.length;
        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target==arr[mid]){
                return arr[mid];
            }
        }
        return arr[end];
    }
}
