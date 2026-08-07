package Mock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RottenGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements in the matrix: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println(rottenOranges(matrix));
    }
    public static int rottenOranges(int [][] matrix){
        Queue<int []> pq=new LinkedList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int fresh=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j]==2){
                    pq.offer(new int[]{i,j});
                }
                else if(matrix[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0)
            return 0;
        int min=0;
        int [] dR={-1,1,0,0};
        int [] dC={0,0,-1,1};
        while(!pq.isEmpty()){
            int size=pq.size();
            boolean rot=false;
            for(int i=0; i<size; i++){
                int [] curr=pq.poll();
                int row=curr[0];
                int col=curr[1];
                for(int j=0; j<4; j++){
                    int newRow=row+dR[j];
                    int newCol=col+dC[j];

                    if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && matrix[newRow][newCol]==1) {
                        matrix[newRow][newCol]=2;
                        pq.offer(new int [] {newRow,newCol});
                        fresh--;
                        rot=true;
                    }
                }
            }
            if(rot){
                min++;
            }
        }
        return fresh>0 ?-1 : min;

    }
}
