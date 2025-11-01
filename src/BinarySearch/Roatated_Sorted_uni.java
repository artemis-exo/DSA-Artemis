package BinarySearch;

public class Roatated_Sorted_uni {
    public static void main(String[] args) {
        int[] arr={7,8,9,1,2,3,4,5,6};
        int target=1;
        System.out.println(sorted(arr,target));

    }
    static  int sorted(int [] arr, int target){
        int start=0;
        int end= arr.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[start]<=arr[mid]){
                if(target>=arr[start]&& target<=arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>=arr[mid]&& target<=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
