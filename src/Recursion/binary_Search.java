package Recursion;

public class binary_Search {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binary(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
    public static int binary(int [] arr,int target, int start,int end){
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]>target){
            return binary(arr,target,start,end-1);
        }
        else{
            return binary(arr,target,start+1,end);
        }
    }
}
