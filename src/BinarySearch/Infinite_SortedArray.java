package BinarySearch;

public class Infinite_SortedArray {
    public static void main(String[] args) {
        int [] arr={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int tar =10;
        System.out.println(set(arr,tar));
    }
    static int  set(int [] arr, int target){
        // first finding the range
        // first start with a box of size 2

        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
            // new end =previous end + size of box *2
            end=end+(end-start+1)*2;
            start=temp;
        }
        return infinite(arr,target,start,end);
    }
    static int infinite(int [] arr, int target, int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=start+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
