package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cycle_Detection_Undirected_DFS_Zero_idx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter no. of edges: ");
        int E = sc.nextInt();
        List<List<Integer>> adj=new ArrayList<List<Integer>>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter " + E + " edges (format: u v for 0-indexed nodes):");
        for(int i=0; i<E;i++){
            int u = sc.nextInt();
            int v=sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        if (checking(V, adj)) {
            System.out.println("Result: Cycle detected in the graph.");
        } else {
            System.out.println("Result: No cycle detected in the graph.");
        }
    }
    public static boolean checking(int V, List<List<Integer>> adj){
        boolean [] visit=new boolean[V];
        for(int i=0; i<V;i++){
            if(!visit[i]){
                if(isCycle(i,-1,adj,visit)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(int i, int parent,List<List<Integer>> adj,boolean [] visit){
        visit[i]=true;
        for(int adjN:adj.get(i)){
            if(!visit[adjN]){
                if(isCycle(adjN,i,adj,visit)){
                    return true;
                }
            }
            else if(adjN!=parent){
                return true;
            }
        }
        return false;
    }
}
