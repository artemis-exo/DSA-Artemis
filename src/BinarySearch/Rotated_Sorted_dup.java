package BinarySearch;

public class Rotated_Sorted_dup {
    public static void main(String[] args) {
        int [] arr={4,5,6,6,1,2,3,4};
        int target=4;
        System.out.println(Minimum(arr,target));
    }
    static int Minimum(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            if(arr[start]==arr[mid]&& arr[mid]==arr[end]){
                start++;
                end--;
                continue;
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
