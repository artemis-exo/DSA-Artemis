package LinearSearch;

public class EvenDigitsLC {
    public static void main(String[] args) {
        int[] arr={12,345,20,6,7896};
        System.out.println(Even(arr));

    }
    static  int Even(int[] arr){
        int count=0;
        for(int ele:arr){
            if(EvenNum(ele)){
                count++;
            }
        }
        return count;
    }
    static boolean  EvenNum(int ele){
        int c=0;
       while(ele>0){
           c++;
           ele=ele/10;
       }
       if(c%2==0){
           return  true;
       }
       return false;
    }
// Optimized Approach
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i: nums){


            if(((int)Math.log10(i)+1)%2==0) count++;

        }
        return count;
    }


}
