package LinearSearch;

public class Max2D {
    public static void main(String[] args) {
        int [][] arr={
                {23,45,67},
                {89,38,94},
                {99,12,36}
        };
        System.out.println(max(arr));

    }
    static int max(int [][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] ints: arr){
            for(int ele:ints){
                if(ele>max){
                    max=ele;
                }
            }
        }
        return  max;
    }
}
