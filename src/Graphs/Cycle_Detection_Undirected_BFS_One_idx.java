
import java.util.*;
public class Cycle_Detection_Undirected_BFS_One_idx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices (V): ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges (E): ");
        int E = sc.nextInt();

        // 1. Initialize adjacency list with size (V + 1)
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter " + E + " edges (format: u v for 1-to-" + V + " nodes):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            addEdge(adj, u, v);
        }

        if (checking(V, adj)) {
            System.out.println("Result: Cycle detected in the graph.");
        } else {
            System.out.println("Result: No cycle detected in the graph.");
        }

        sc.close();
    }

    public static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static boolean checking(int V, List<List<Integer>> adj) {
        // 2. Size (V + 1) to safely access indices 1 through V
        boolean[] visit = new boolean[V + 1];

        // 3. Loop from 1 to V instead of 0 to V - 1
        for (int i = 1; i <= V; i++) {
            if (!visit[i]) {
                if (isCycle(i, adj, visit)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycle(int src, List<List<Integer>> adj, boolean visit[]) {
        visit[src] = true;
        Queue<int[]> pq = new LinkedList<>();
        pq.offer(new int[] {src, -1});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int parent = curr[1];

            for (int adjN : adj.get(node)) {
                if (!visit[adjN]) {
                    visit[adjN] = true;
                    pq.offer(new int[]{adjN, node});
                } else if (parent != adjN) {
                    return true;
                }
            }
        }
        return false;
    }
}
