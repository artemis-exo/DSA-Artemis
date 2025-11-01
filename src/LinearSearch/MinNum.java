package LinearSearch;

public class MinNum {
    public static void main(String[] args) {
        int [] arr={353,4,7,-7,6,3,233,33,23};
        System.out.println(min(arr));
    }
    static int min(int [] arr){
        int res=arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i]<res){
                res=arr[i];
            }
        }
        return  res;
    }
}
