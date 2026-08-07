package BootCamp.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class CpGraphList {

    // DFS implementation using Adjacency List
    public static void dfs(int u, List<List<Integer>> adj, boolean[] visited) {
        visited[u] = true;
        System.out.print(u + " "); // Process the current node

        // Iterate ONLY through the actual neighbors of vertex u
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfs(v, adj, visited);
            }
        }
    }

    // BFS implementation using Adjacency List
    public static void bfs(int start, int n, List<List<Integer>> adj) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " "); // Process the current node

            // Iterate ONLY through the actual neighbors of vertex u
            for (int v : adj.get(u)) {
                if (!visited[v]) {
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
        int n = sc.nextInt();

        System.out.println("Enter number of edges: ");
        int m = sc.nextInt();

        // 1. Initialize the Adjacency List
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>()); // Create an empty list for each vertex
        }

        // 2. Read the edges
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            // Assuming 0-indexed vertices
            adj.get(u).add(v);
            adj.get(v).add(u); // Remove this line if the graph is directed!
        }

        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        System.out.println("\nDFS Traversal starting from node 0: ");
        boolean[] visited = new boolean[n];
        dfs(0, adj, visited);
        System.out.println();

        System.out.println("BFS Traversal starting from node 0: ");
        bfs(0, n, adj);
        System.out.println();

        sc.close();
    }
}
