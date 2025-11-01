package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
      int [] arr1={99,95,87,65,43,33,32,16,14,8,4,3,2,1,-5,-78};
      int[] arr2={-9,-1,1,3,5,13,11,16,22,29,32,39,44,49,67,89,99};
      int tar1=16;
      int tar2=44;
        System.out.println(orderAgnosticBS(arr1,tar1));
        System.out.println(orderAgnosticBS(arr2,tar2));

    }
    static int orderAgnosticBS(int [] arr, int target){
        int start= 0;
        int end= arr.length-1;
        // find whether the array is sorted in ascending or descending
        boolean isAsc=arr[start]<arr[end];
        

        while(start<=end){
            // find the middle element
            // int mid=(start+end)/2; - it might be possible that (start+end) exceeds the range of int in java
            int mid= start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                } else if(target>arr[mid]){
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if(target<arr[mid]){
                    start=mid+1;
                }
            }
            }
        return -1;
        }
    }


