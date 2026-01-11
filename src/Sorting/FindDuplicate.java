package Sorting;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr={5,7,2,6,1,3,6,4};
       int y= findDuplicate(arr);
        System.out.println(y);

    }
    public static int findDuplicate(int [] arr){
        int i=0;
        while(i< arr.length){
            if(arr[i]!=i+1) {
                int corr = arr[i] - 1;
                if (arr[i] != arr[corr]) {
                    swap(arr, i, corr);
                } else {
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
      return -1;
    }
    public  static void swap(int [] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
