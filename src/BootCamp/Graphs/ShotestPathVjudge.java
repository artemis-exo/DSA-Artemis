package BootCamp.Graphs;

import java.util.*;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

 class ShortestPathVjudge {
    int cost(ArrayList<ArrayList<Integer>> adj, int start, int end) {
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;
        int res = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int cur = q.poll();
                if (cur == end) {
                    return res;
                }
                for (int neighbor : adj.get(cur)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        q.offer(neighbor);
                    }
                }
            }
            res += 6;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int edge[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
                edge[i][0] = sc.nextInt();
                edge[i][1] = sc.nextInt();
            }
            int s = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int[] e : edge) {
                adj.get(e[0]).add(e[1]);
                adj.get(e[1]).add(e[0]);
            }
            ArrayList<Integer> res = new ArrayList<>();
            ShortestPathVjudge obj = new ShortestPathVjudge();
            for (int i = 1; i <= n; i++) {
                if (i == s) continue;
                res.add(obj.cost(adj, s, i));
            }
            for (int val : res) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
