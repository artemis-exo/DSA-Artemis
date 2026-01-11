package Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmaller {
    public static void main(String[] args) {
        int [] arr={4, 8, 5, 2, 25};
        System.out.println(nextSmallerEle(arr));
    }

       public static ArrayList<Integer> nextSmallerEle(int[] arr) {
            // code here
            Stack<Integer> st=new Stack<>();
            st.push(-1);
            ArrayList<Integer> li=new ArrayList<>();
            for(int i=arr.length-1; i>=0;i--){
                int current=arr[i];
                while(st.peek()>=current){
                    st.pop();
                }
                li.add(st.peek());
                st.push(current);
            }
            Collections.reverse(li);
            return li;

        }

    }

