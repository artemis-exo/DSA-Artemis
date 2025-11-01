package LinearSearch;

public class SearchRange {
    public static void main(String[] args) {
        int [] arr={353,4,7,7,6,3,233,33,23};
        int target=233;
        System.out.println(linearSearch1(arr,target,2,8));

    }

    static int linearSearch1(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            int ele=arr[i];
            if(ele==target){
                return i;
            }
        }
        return -1;
    }
}
