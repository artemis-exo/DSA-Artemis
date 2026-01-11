package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater2LC {
    public static void main(String[] args) {
       int [] arr={1,2,1};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        // Same structure as of the normal NGE just traversing twice and modulo for circular
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[nums.length];
        for(int i=2*nums.length-1; i>=0;i--){
            // Traversing the array twice for the circular element hunt
            int current=nums[i%nums.length]; // Typically used for circular types
            while(!st.isEmpty() && st.peek()<=current){
                st.pop();
            }
            if(i<nums.length){
                if (st.isEmpty()) {
                    arr[i] = -1;
                } else {
                    arr[i] = st.peek();
                }
            }
            st.push(current);
            // System.out.print(st);
        }
        return arr;
    }
}
