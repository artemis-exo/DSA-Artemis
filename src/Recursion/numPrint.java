package Recursion;

public class numPrint {
    public static void main(String[] args) {
        printo(5);
    }
    public static void printo (int n){
        if(n==0)
            return;
        System.out.println(n);
        printo(n-1);

    }
}
