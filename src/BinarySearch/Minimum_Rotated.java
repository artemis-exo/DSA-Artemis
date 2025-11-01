package BinarySearch;

public class Minimum_Rotated {
    public static void main(String[] args) {
        int [] arr={5,6,7,1,2,3,4};
        System.out.println(Min(arr));
    }
    static int Min(int [] arr){
        int start=0;
        int end=arr.length;
        int mid;
        int res=Integer.MAX_VALUE;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[start]<=arr[mid]){
                res=Math.min(res,arr[start]);
                start=mid+1;
            }
            else{
                res=Math.min(res,arr[mid]);
                end=mid-1;
            }
        }
        return res;
    }
}
