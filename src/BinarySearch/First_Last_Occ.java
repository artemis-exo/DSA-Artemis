package BinarySearch;

import java.util.Arrays;

public class First_Last_Occ {
    public static void main(String[] args) {
        int [] arr={1,3,3,3,7,9};
        int tar=3;
        int [] nums={firstOccurrence(arr,tar),LastOccurrence(arr,tar)};
        System.out.println(Arrays.toString(nums));
    }
    public static int firstOccurrence(int[] arr, int key) {
        int start=0, end=arr.length-1, ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int LastOccurrence(int[] arr, int key) {
        int start=0, end=arr.length-1, ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}
