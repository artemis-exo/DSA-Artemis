package ArraysArrayList;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr={34,546,23,7,8,322,4};
      //  swap(arr,1,4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Also called 2 pointer method
    static void reverse(int arr[]){
        int start=0;
        int end= arr.length-1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
