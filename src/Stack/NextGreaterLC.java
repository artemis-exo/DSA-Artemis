package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterLC {
    public static void main(String[] args) {
       int [] nums1 = {4,1,2};
       int [] nums2 = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums1.length, m = nums2.length;
        int ans[] = new int[n];


        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(nums1[i], i);
            ans[i] = -1;
        }

        for (int i = m-1; i >= 0; i--) {
            int curr = nums2[i];

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            if (indexMap.containsKey(curr)) {
                ans[indexMap.get(curr)] = st.isEmpty() ? -1 : st.peek();
            }

            st.push(curr);
        }

        return ans;
    }
}
