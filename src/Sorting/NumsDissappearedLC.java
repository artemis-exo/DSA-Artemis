package Sorting;

import java.util.ArrayList;
import java.util.List;

public class NumsDissappearedLC {
    public static void main(String[] args) {
    int [] arr={4,3,2,7,8,2,3,1};
   // List <Integer> result=dissa(arr);
        System.out.println("Missing Numbers: "+dissa(arr));
    }
    static List<Integer> dissa(int [] arr){
        int i=0;
        while(i< arr.length){
            int tru=arr[i]-1;
            if(arr[i]!=arr[tru]){
                swap(arr,i,tru);
            }
            else{
                i++;
            }
        }
        List<Integer> res=new ArrayList<>();
        for(int io=0;io< arr.length;io++){
            if(arr[io]!=io+1){
                res.add(io+1);
            }
        }
        return res;
    }
    static void swap(int [] arr, int tru, int i){
        int temp=arr[tru];
        arr[tru]=arr[i];
        arr[i]=temp;
    }
}
