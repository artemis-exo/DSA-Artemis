package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] arr1={1,2,1,3,4,2,5,1};
        System.out.println(MorePeeks(arr1));
        System.out.println(Peak(arr));
        System.out.println(peek2(arr));

    }
    static  int Peak(int [] arr){
        int n= arr.length;
        if (n==1)
            return 0;
        if(arr[0]>arr[1])
            return 0;
        if(arr[n-1]>arr[n-2])
            return n-1;
        int start=1;
        int end= arr.length-1;
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
    // Peak elements approach 2
    static  int peek2(int[] arr){
        int n= arr.length;
        if (n==1)
            return 0;
        if(arr[0]>arr[1])
            return 0;
        if(arr[n-1]>arr[n-2])
            return n-1;
        int start=1;
        int end= arr.length-2;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }
            else if(arr[mid]>arr[mid-1]){
                start=mid+1;
            }
        }
        return -1;

    }
    static  int MorePeeks(int[] arr){
        int n= arr.length;
        if (n==1)
            return 0;
        if(arr[0]>arr[1])
            return 0;
        if(arr[n-1]>arr[n-2])
            return n-1;
        int start=1;
        int end= arr.length-2;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return mid;
            }
            else if(arr[mid]>arr[mid+1]){
                end=mid-1;
            }
            else if(arr[mid]>arr[mid-1]){
                start=mid+1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

}
