package Sorting;
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Quick(arr,0,size-1);
        System.out.println("Sorted array : "+Arrays.toString(arr));
    }
    public static  void Quick(int [] arr, int low, int high){
        if(low<high){
            int per=party(arr,low,high);

            Quick(arr,low,per-1);
            Quick(arr,per+1,high);
        }
    }
    public static int party(int [] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;

        for(int j=low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

}
