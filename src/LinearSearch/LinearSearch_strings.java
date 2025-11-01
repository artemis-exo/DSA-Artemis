package LinearSearch;

public class LinearSearch_strings {
    public static void main(String[] args) {
        String name="Vedaant";
        char tar='a';
        System.out.println(search(name,tar));
        System.out.println(search2(name,tar));
    }
    static  boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0; i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return  false;
    }
    static  int search2(String str, char target){
        if(str.length()==0){
            return -1;
        }
        for(char ch: str.toCharArray()){
        if(ch==target){
            return ch;
        }
        }
        return -1;
    }
}
