package BootCamp.Graphs.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
class shortestPathDag{
 static class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
    public static int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Pair>>adj=new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int i[]:edges){
            int u=i[0];
            int v=i[1];
            int w=i[2];
            adj.get(u).add(new Pair(v,w));
        }
        int visit []=new int[V];
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<V; i++){
            if(visit[i]==0){
                topoSort(i,st,adj,visit);
            }
        }
        int [] dist=new int[V];
        Arrays.fill(dist,(int)(1e9));
        dist[0]=0;

        while(!st.isEmpty()){
            int node =st.pop();
            for(Pair i:adj.get(node)){
                int v=i.first;
                int wt=i.second;

                if(dist[node]+wt<dist[v]){
                    dist[v]=dist[node]+wt;
                }
            }
        }
        for(int i=0; i<V; i++){
            if(dist[i]==(int)(1e9))
                dist[i]=-1;
        }
        return dist;
    }
    public static void topoSort(int node, Stack<Integer>st, ArrayList<ArrayList<Pair>>adj,int [] visit){
        visit[node]=1;
        for(Pair it:adj.get(node)){
            if(visit[it.first]==0)
                topoSort(it.first,st,adj,visit);
        }
        st.push(node);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices (V) and edges (E): ");
        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] edges = new int[E][3];

        System.out.println("Enter the edges (source destination weight):");
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt(); // u
            edges[i][1] = sc.nextInt(); // v
            edges[i][2] = sc.nextInt(); // weight
        }

        // Call the function
        int[] result = shortestPath(V, E, edges);

        // Print the result
        System.out.print("Shortest distances from source node 0: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}