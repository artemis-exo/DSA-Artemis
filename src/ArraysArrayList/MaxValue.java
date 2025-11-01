package ArraysArrayList;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {797, 35, 678, 6, 43, 3912};
        System.out.println(max(arr));
        System.out.println(maxi(arr,1,4));
    }

    static int max(int[] arr) {
        int maxo = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxo) {
                maxo = arr[i];
            }
        }
        return maxo;
    }

    static int maxi(int[] arr, int start, int end) {
        int maxoo = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxoo) {
                maxoo = arr[i];
            }
        }
        return maxoo;
    }
}