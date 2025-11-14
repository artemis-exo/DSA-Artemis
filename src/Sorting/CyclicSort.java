package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr={5,3,4,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void  cyclic(int [] arr){
        int i=0;
        while(i< arr.length){
            int tru=arr[i]-1;
            if(arr[tru]!=arr[i]){
                swap(arr,tru,i);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int tru, int i){
        int temp=arr[tru];
        arr[tru]=arr[i];
        arr[i]=temp;
    }
}
