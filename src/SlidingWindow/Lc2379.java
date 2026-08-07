package SlidingWindow;

public class Lc2379 {
    public static void main(String[] args) {

    }
    public static int minimumRecolors(String blocks, int k) {
        //int right=0,count=0;
        //  String s="";
        // for(int i=0; i<k;i++){
        //     char c=blocks.charAt(i);
        //     s=s+c;
        // }
        // for(int i=0;i<s.length();i++){
        //     char ch=s.charAt(i);
        //     if(ch=='W'){
        //        count++;
        //     }
        // }

        // It is almost the replica of 1423 Question
        int count=0;
        for(int i=0; i<k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int min=count;
        System.out.print(count);
        for(int i=k; i<blocks.length(); i++){
            if(blocks.charAt(i)=='W')
            {
                count++;
            }
            if(blocks.charAt(i-k)=='W'){
                count--;
            }
            min=Math.min(count,min);
        }
        return min;

    }
}
