package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={5,32,53,56,224,7,623,6};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        selection2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr){
        for(int i=0;i< arr.length;i++){
            int last= arr.length-i-1;
            int max=get(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int get(int [] arr, int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int [] arr,int first, int sec){
        int temp=arr[first];
        arr[first]=arr[sec];
        arr[sec]=temp;
    }

    static void selection2(int [] arr){
        for(int i=0; i< arr.length-1;i++){
            int min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
