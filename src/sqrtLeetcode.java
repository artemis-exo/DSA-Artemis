import java.util.Scanner;
public class sqrtLeetcode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of check the Square root");
        int sq=sc.nextInt();
        System.out.println(mySqrt(sq));
    }
    public static int mySqrt(int x) {
        int start=1;
        int end =x;
        int res=0;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid>x/mid){
                end=mid-1;
            }
            else{
                res=mid;
                start=mid+1;
            }
        }
        return res;
    }
}
