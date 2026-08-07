package BootCamp.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GraphBfs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int m=sc.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        bfs(matrix,0);
    }
    public static void bfs(int [][] matrix,int start) {
        boolean[] visited = new boolean[matrix.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()) {
            int e=queue.poll();
            System.out.print(e + " ");
            for(int v=0; v< matrix.length; v++){
                if(matrix[e][v]==1 && !visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
        System.out.println();
    }
}
