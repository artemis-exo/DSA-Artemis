package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int [] arr={1,2,4,5,6,2,3,4};
        System.out.println(Peak(arr));

    }
    static  int Peak(int [] arr){
        int start=0;
        int end= arr.length;
        int mid;
        while(start<end){
            mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end !=mid-1
                end=mid;
            } else{
                // you are in the asc part of the array
                start=mid+1;
            }
        }
        // in the end start==end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element that is the max one because that is why the checks says
        // more elaboration: at every point of time for start and end,they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start;
    }
}
