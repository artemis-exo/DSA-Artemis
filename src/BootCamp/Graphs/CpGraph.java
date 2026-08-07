package BootCamp.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CpGraph {

    // DFS implementation using Adjacency Matrix
    public static void dfs(int u, int n, int[][] adj, boolean[] visited) {
        visited[u] = true;
        System.out.print(u + " "); // Process the current node

        // Iterate through all possible vertices
        for (int v = 0; v < n; v++) {
            // If there is an edge and the vertex is unvisited
            if (adj[u][v] == 1 && !visited[v]) {
                dfs(v, n, adj, visited);
            }
        }
    }

    // BFS implementation using Adjacency Matrix
    public static void bfs(int start, int n, int[][] adj) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " "); // Process the current node

            // Iterate through all possible vertices
            for (int v = 0; v < n; v++) {
                // If there is an edge and the vertex is unvisited
                if (adj[u][v] == 1 && !visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        if (!sc.hasNextInt()) return;

        // Read number of vertices (n) and edges (m)
        int n = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int m = sc.nextInt();

        // Initialize an n x n adjacency matrix
        // In Java, arrays are initialized to 0 by default
        int[][] adj = new int[n][n];

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Assuming 0-indexed vertices
            adj[u][v] = 1;
            adj[v][u] = 1; // Remove this line if the graph is directed
        }

        for(int i=0; i<adj.length; i++){
            for(int j=0; j<adj[i].length; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("DFS Traversal starting from node 0: ");
        boolean[] visited = new boolean[n];
        dfs(0, n, adj, visited);
        System.out.println();

        System.out.println("BFS Traversal starting from node 0: ");
        bfs(0, n, adj);
        System.out.println();

        sc.close();
    }
}
