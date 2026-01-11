package Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] arr={2,0,1};
        System.out.println(firstMissingPositive(arr));
    }
    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int corr=nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[corr]){
                swap(nums,i,corr);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;

    }
    public static void swap(int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
