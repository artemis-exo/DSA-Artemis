package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
       int [] arr={5,4,3,2,1};
       inserion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void inserion( int []arr){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1])
                    swap(arr,j,j-1);
                else{
                    break;
                }
            }
        }
    }
    static void swap(int [] arr,int j,int k){
        int temp=arr[j];
        arr[j]=arr[k];
        arr[k]=temp;
    }
}
