package LinearSearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int [][] arr={
                {23,45,67},
                {89,38,94},
                {99,12,36}
        };
        int target=12;
        int [] ans=search(arr,target);  // format of return value
        System.out.println(Arrays.toString(ans));
    }
    static  int[] search(int[][] arr, int target){
        for(int i=0;i< arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return  new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
