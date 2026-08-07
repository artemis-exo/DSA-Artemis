package SlidingWindow;

public class LC1423 {
    public static void main(String[] args) {
       int [] cardPoints = {1,2,3,4,5,6,1}; int k = 3;
        System.out.println(maxScore(cardPoints,k));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int right=0, rsum=0, lsum=0, maxi=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        //System.out.print(lsum);
        maxi=lsum;
        right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-cardPoints[i];
            rsum=rsum+cardPoints[right];
            right--;

            maxi=Math.max(maxi,(lsum+rsum));

        }
        return maxi;

    }
}
