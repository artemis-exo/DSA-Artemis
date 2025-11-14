package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={34,3,43,46,32,-474,6,45,4,43,444};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        boolean checked;
        for(int i=0; i< arr.length-1; i++){
             checked=false;
            for(int j=0;j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                checked=true;
                }
            }
            if(!checked)
                break;
        }
    }
}
