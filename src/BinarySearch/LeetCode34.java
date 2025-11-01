package BinarySearch;

import java.util.Arrays;

public class LeetCode34 {
    public static void main(String[] args) {
        int [] arr={1,3,3,3,7,9};
        int tar=3;
        System.out.println(Arrays.toString(searchRange(arr, tar)));

        // First of all find the target element through the mid (Temporary)
        // Then find the First occurrence of it in th left side by setting the end pointer by mid
        // and When only we find the First occurrence then only we will traverse to the right by setting start
        // by mid and Now in this we only need set and modify the start pointer for Last occurrence
    }

    static  int[] searchRange(int [] nums, int target){
        int[] res={-1,-1};
        res[0]=search(nums,target,true);
        if(res[0]!=-1){
            res[1]=search(nums,target,false);
        }
        return res;
    }
    static int search(int [] nums, int target, boolean findStartIndex){
        int ans =-1;
        int start=0;
        int end= nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;

                if(findStartIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return  ans;
    }
}
