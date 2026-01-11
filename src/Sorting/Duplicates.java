package Sorting;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        int [] arr={ 4,3,2,7,8,2,3,1};
        System.out.println(duplicates(arr));

    }
    public static List<Integer> duplicates(int [] arr){
        int i=0;
        while(i< arr.length){
            int corr=arr[i]-1;
            if(arr[i]!=arr[corr]){
                swap(arr, i, corr);
            }
            else{
                i++;
            }
        }
        List<Integer> ache=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                ache.add(arr[j]);
            }
        }
        return ache;
    }

    public  static void swap(int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
