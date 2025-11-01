package LinearSearch;

public class Liner_search {
    public static void main(String[] args) {
        int[] num={23,4,546,-56,-5,435,2,53,5-53};
        int tar=-5;
        int res=linearSearch(num,tar);
        System.out.println(res);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
