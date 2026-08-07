package BootCamp.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphVertices {

    public static void bfs(int start, int v, int[][] adj) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " "); // Print traversal as requested

            // Check all potential neighbors in the matrix
            for (int i = 0; i < v; i++) {
                if (adj[u][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println();
    }
    public static void dfs(int start, int v, int[][] adj,boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < v; i++) {
            if (adj[start][i] == 1 && !visited[i]) {
                //visited[i] = true;
                dfs(i, v, adj, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        if (!sc.hasNextInt()) return;
        // 1. First line contains V
        int v = sc.nextInt();
        // 2. Next V lines contain the adjacency matrix
        int[][] adj = new int[v][v];
        for (int i = 0; i <v; i++) {
            for (int j = 0; j < v; j++) {
                adj[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        boolean[] visited = new boolean[v];
        // 3. Print BFS traversal starting from vertex 0
        bfs(0, v, adj);
        dfs(0,v,adj,visited);

        sc.close();
    }
}