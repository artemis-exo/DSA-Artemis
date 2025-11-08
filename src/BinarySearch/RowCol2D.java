package BinarySearch;

import java.util.Arrays;

public class RowCol2D {
    public static void main(String[] args) {
        int [][] arr={{7,9,12,40},
                      {16,28,19,37},
                      {22,24,46,57},
                      {32,36,59,64}};
        int target=36;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int [] search(int [][] matrix,int target){
        int row=0;
        int col=matrix.length-1;

        while(row<matrix.length &&  col>=0){
            if(matrix[row][col]==target){
                return new int []{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
