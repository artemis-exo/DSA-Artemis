package BinarySearch;

public class Rotated_count {
    public static void main(String[] args) {
        int [] arr={5,6,7,1,2,3,4};
        System.out.println(RotatedCount(arr));
    }
    static int RotatedCount(int [] arr){
        int start=0;
         int end= arr.length-1;
        int  index=-1;
        int ans=Integer.MAX_VALUE;
         while(start<=end){
             int mid=start+(end-start)/2;
             if(arr[start]<=arr[end]){
                 if(arr[start]<ans) {
                     index = start;
                     ans = arr[start];
                 }
                 break;
             }
             else if(arr[start]<=arr[mid]){
                 if(arr[start]<ans){
                     index=start;
                     ans=arr[start];
                 }
                 start=mid+1;
             }
             else{
                 if(arr[mid]<ans){
                     index=mid;
                     ans=arr[mid];
                 }
                 end=mid-1;
             }
         }
         return index;
    }
}
