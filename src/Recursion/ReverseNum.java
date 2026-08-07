package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(helper(234));
    }
    public static int helper(int n){
        return rev(n,0);

    }
    public static  int  rev(int n,int su){
        if(n<9)
            return su*10+n;
        int digit=n%10;
        return rev(n/10,su*10+digit);
    }
}
