package Graphs;
import java.io.*;
import java.util.ArrayList;
import  java.util.Scanner;

public class Adj_Undirected {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Nodes");
        int node=sc.nextInt();

        System.out.println("Enter the number of Edges");
        int edge=sc.nextInt();

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        for(int i=0; i<=node; i++){
            list.add(new ArrayList<Integer>());
        }

        System.out.println("Enter the Edges (a,b):");
        for(int i=0; i<edge;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(int i=1; i<=node;i++){
            System.out.print(i + "->");

            for(int j=0; j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j) +" ");
            }
            System.out.println();
        }
    }
}
