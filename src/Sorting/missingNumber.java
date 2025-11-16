package Sorting;

public class missingNumber {
    public static void main(String[] args) {
        int [] arr={3,0,1};
        System.out.println(missingNumber(arr));
        System.out.println(missingNumber1(arr));
    }
    // Leetcode Optimized approach
    static int missingNumber(int[] arr) {
        int xor=0;

        for(int i=0; i<=arr.length;i++)
        {
            xor = xor^i;
        }
        for(int num:arr)
        {
            xor = xor^num;
        }
        return xor;
    }
    // Approach which i have applied
    public static int missingNumber1(int[] nums) {
        int i=0;
        while(i<nums.length){
            int  tru=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[tru]){
                swap(nums,i,tru);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int e, int f){
        int temp=nums[e];
        nums[e]=nums[f];
        nums[f]=temp;
    }
}
