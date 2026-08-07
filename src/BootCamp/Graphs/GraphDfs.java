package BootCamp.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GraphDfs {
    int V; int[][] graph;
    GraphDfs(int V) {
        this.V = V;
        this.graph = new int[V][V];
    }
//    public void bfs(int start) {
//        boolean[] visited = new boolean[V];
//        Arrays.fill(visited, false);
//        ArrayList<Integer> q = new ArrayList<>();
//        q.add(start);
//        visited[start] = true;
//        int current;
//        while(!q.isEmpty()) {
//            current = q.get(0);
//            System.out.print(current + " ");
//            q.remove( q.get(0) );
//            for(int i=0; i < V; i++) {
//                if(graph[current][i] == 1 && !visited[i]) {
//                    q.add(i);
//                    visited[i] = true;
//                }
//            }
//        }
//        System.out.println();
//    }
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);
        dfsUtil(start, visited);
    }
    public void dfsUtil(int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for(int i=0; i < V; i++) {
            if(graph[start][i] == 1 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

//    public void bfs(int start) {
//        boolean[] visited = new boolean[V];
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(start);
//        visited[start] = true;
//        while(!queue.isEmpty()) {
//            int e=queue.poll();
//            System.out.print(e + " ");
//            for(int v=0; v<V; v++){
//                if(graph[e][v]==1 && !visited[v]) {
//                    visited[v] = true;
//                    queue.add(v);
//                }
//            }
//        }
//        System.out.println();
//    }
    public static void main(String[] args) {
        int V = 7;
        GraphDfs graph = new GraphDfs(V);
        graph.graph = new int[][] {
                {0, 1, 0, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 1, 0}
        };
       // graph.bfs(0);                           // 0 1 3 2 4 5 6
        graph.dfs(0);                           // 0 1 2 5 4 3 6
    }

}
