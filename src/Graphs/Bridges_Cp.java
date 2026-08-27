package Graphs;
/*

Intuitive  Analogy(Bridges In Graph --> Trajan's Algo)
tin[v] = when you first meet a family member.

low[v] = the earliest ancestor that person can still reach through cousins/uncles (back edges).

If a child cannot reach back to its parent’s generation or higher, then the link to that child is fragile → that edge is a bridge.
 */

/*
 KEy Idea to do it

 Adjacency list: Uses List<List<Integer>> for graph storage.

DFS logic: Mirrors your C++ code with tin and low arrays.

Bridge detection: low[to] > tin[v] condition is identical.

Parent skipping: Preserved with parentSkipped flag.

IS_BRIDGE: Currently prints bridges; you can replace with custom logic.



*** Can be Done Only Using DFS
 */

import java.util.*;

public class Bridges_Cp {
    private int n; // number of nodes
    private List<List<Integer>> adj; // adjacency list
    private boolean[] visited;
    private int[] tin, low;
    private int timer;

    public Bridges_Cp(int n) {
        this.n = n;
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        visited = new boolean[n];
        tin = new int[n];
        low = new int[n];
    }

    // Add undirected edge
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    private void dfs(int v, int p) {
        visited[v] = true;
        tin[v] = low[v] = timer++;
        boolean parentSkipped = false;

        for (int to : adj.get(v)) {
            if (to == p && !parentSkipped) {
                parentSkipped = true;
                continue;
            }
            if (visited[to]) {
                // Back edge
                low[v] = Math.min(low[v], tin[to]);
            } else {
                dfs(to, v);
                low[v] = Math.min(low[v], low[to]);
                if (low[to] > tin[v]) {
                    IS_BRIDGE(v, to);
                }
            }
        }
    }

    public void findBridges() {
        timer = 0;
        Arrays.fill(visited, false);
        Arrays.fill(tin, -1);
        Arrays.fill(low, -1);

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, -1);
            }
        }
    }

    // Function to process the found bridge
    private void IS_BRIDGE(int u, int v) {
        System.out.println("Bridge found: " + u + " - " + v);
    }

    // Example usage
    public static void main(String[] args) {
        Bridges_Cp bf = new Bridges_Cp(5);
        bf.addEdge(0, 1);
        bf.addEdge(1, 2);
        bf.addEdge(2, 0);
        bf.addEdge(1, 3);
        bf.addEdge(3, 4);

        bf.findBridges();
    }
}

