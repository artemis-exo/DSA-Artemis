package ArraysArrayList;

import java.util.Arrays;

public class Swaping {
    public static void main(String[] args) {
        int [] arr={34,546,23,7,8,322,4};
        swap(arr,1,4);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
