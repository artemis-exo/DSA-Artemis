package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LC3 {
    public static void main(String[] args) {
       String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int start=0 , end=0 , maxi=0;
        Set<Character> set=new HashSet<>();
        while(end<s.length()){

            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));

            maxi=Math.max(maxi, end-start+1);
            end++;

        }
        return maxi;

    }
}
