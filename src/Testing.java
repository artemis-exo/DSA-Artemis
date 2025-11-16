import java.util.Arrays;
import java.util.Scanner;
class Testing {
    public static void main(String[] args) {
        int[] num={3,0,1};
       int e= missingNumber(num);
        System.out.println(e);
//       int [] arr={2,7,11,15};
//       int target=26;
//        System.out.println(Arrays.toString(twoSum(arr, target)));
//    }
//    public static int[] twoSum(int[] nums, int target) {
//
//        for(int i=1;i<nums.length;i++){
//            for(int j=i;j<nums.length;j++){
//                int a=j-i;
//                if(target==nums[a]+nums[j]){
//                    return new int[]{a,j};
//                }
//            }
//        }
//        return null;
//    }
        int [] nums={0,1,1,0};
        System.out.println(getSneakyNumbers(nums));
    }

    static int[] getSneakyNumbers(int[] nums) {
        int []van;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j + 1]) {
                     van = new int[]{nums[i]};
                }
            }
        }
        return nums;
    }
    public static int missingNumber(int[] nums) {
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