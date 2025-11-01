package ArraysArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> heck =new ArrayList<>();
//        heck.add(23);
//        heck.add(9879);
//        heck.add(3628);
//        heck.add(3424);
//        heck.add(56);

//        heck.set(0,78);
//        System.out.println(heck);

        for(int i=0; i<5; i++){
            heck.add(sc.nextInt());
        }
        // get item at any index
        for(int i=0; i<5;i++){
            System.out.println(heck.get(i));
        }
        System.out.println(heck);
    }
}
