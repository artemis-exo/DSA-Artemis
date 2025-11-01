package LinearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] arr={
                {1,5,3},
                {3,9,1}
        };
        System.out.println(Richest(arr));
    }
    static int Richest(int [][]arr){
        int ans=Integer.MIN_VALUE;
        for(int[] ele:arr){
            int sum=0;
            for(int element:ele){
                sum+=element;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
