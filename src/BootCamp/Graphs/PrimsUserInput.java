package BootCamp.Graphs;

import java.util.Arrays;
import java.util.Scanner;

public class PrimsUserInput {

    // Made static and added V as a parameter
    public static void prims(int V, int[][] graph, int start) {
        int[] cost = new int[V];
        boolean[] visited = new boolean[V];

        Arrays.fill(visited, false);
        Arrays.fill(cost, Integer.MAX_VALUE);

        // The cost to start at the initial node is always 0
        cost[start] = 0;

        for(int i = 0; i < V - 1; i++) {
            // Pass V to the helper method
            int u = minCostVertex(V, cost, visited);
            visited[u] = true;

            // find neighbors of 'u'
            for(int v = 0; v < V; v++) {
                if(graph[u][v] != 0 && !visited[v] && cost[v] > graph[u][v]) {
                    cost[v] = graph[u][v];
                }
            }
        }

        int totalCost = 0;
        System.out.print("Edge costs to join MST: ");
        for(int i = 0; i < V; i++) {
            System.out.print(cost[i] + " ");
            totalCost += cost[i];
        }
        System.out.println();
        System.out.println("Total MST Cost: " + totalCost);
    }

    // Made static and added V as a parameter
    public static int minCostVertex(int V, int[] cost, boolean[] visited) {
        int minCost = Integer.MAX_VALUE;
        int minVertex = -1;

        for(int i = 0; i < V; i++) {
            if(cost[i] < minCost && !visited[i]) {
                minCost = cost[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices (V):");
        if (!sc.hasNextInt()) return;

        // 1. Initialize V inside main
        int V = sc.nextInt();

        // 2. Initialize the graph array directly inside main
        int[][] graph = new int[V][V];

        System.out.println("Enter the adjacency matrix (" + V + " x " + V + "):");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the starting vertex (0 to " + (V - 1) + "):");
        int start = sc.nextInt();

        // 3. Call the static method directly without creating an object
        prims(V, graph, start);

        sc.close();
    }
}
