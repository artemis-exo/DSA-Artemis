package BootCamp.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphVertices_one {

    public static void bfs(int start, int v, int[][] adj) {
        boolean[] visited = new boolean[v+1];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " "); // Print traversal as requested

            // Check all potential neighbors in the matrix
            for (int i = 1; i <= v; i++) {
                if (adj[u][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println();
    }

    public static void dfs(int u, int v, int[][] adj, boolean[] visited) {
        // Mark the current node as visited and print it
        visited[u] = true;
        System.out.print(u + " ");

        // Check all potential neighbors from 1 to v
        for (int i = 1; i <= v; i++) {
            // If there is an edge and it hasn't been visited yet
            if (adj[u][i] == 1 && !visited[i]) {
                // Recursively dive deeper into this neighbor
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
        int[][] adj = new int[v+1][v+1];
        for (int i = 1; i <=v; i++) {
            for (int j = 1; j <= v; j++) {
                adj[i][j] = sc.nextInt();
            }
        }
        for(int i=1; i<=v; i++){
            for(int j=1; j<=v; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
         boolean [] visit=new boolean[v+1];
        // 3. Print BFS traversal starting from vertex 0
        bfs(1, v, adj);
        dfs(1,v,adj,visit);

        sc.close();
    }
}
