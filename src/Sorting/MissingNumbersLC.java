package Sorting;

public class MissingNumbersLC {
    public static void main(String[] args) {
       // for this question my approach is very simply and amicable
       // 1. According to the question the array form 0 to n so from this first thing which comes in our mind is Cyclic sort because it is best for this type of questions
       // 2. Step 1- We will first sort the elements from 0 to given n
        // 3. Step 2- After this we will simply run a loop from 0 checks the elements which is missing and returns it value

        int [] arr={3,0,1,2,6,4};
        System.out.println(Missing(arr));
    }

    static int Missing(int [] arr){
        int i=0;
        while(i< arr.length){
            int tru=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[tru]){
                swap(arr,tru,i);
            }
            else{
                i++;
            }
        }
        for(int io=0; io< arr.length;io++){
            if(io!=arr[io]){
                return io;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int tru, int i){
        int temp=arr[tru];
        arr[tru]=arr[i];
        arr[i]=temp;
    }
}
