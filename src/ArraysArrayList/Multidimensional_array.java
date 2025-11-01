package ArraysArrayList;

import java.util.Arrays;
import java.util.Scanner;

class Multidimensional_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [][] arr= {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
        // input
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // output
//        for(int i=0; i< arr.length; i++){
//            for(int j=0; j<arr[i].length;j++){
//                System.out.print(arr[i][j]+ " ");
//            }
//            System.out.println();
//        }

//     // Output 2
//        for(int row=0; row< arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // Output 3
        for(int []a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}