package BinaryTrees;

public class BFS {
    int vert;
    int [][] matrix;
     int [] queue;
      int front =0;
      int rear=-1;
      boolean[] visit;

      BFS(int v){
          vert = v;
          matrix=new int[v][v];
          visit=new boolean[v];
          queue =new int[v];
      }
      void addEdge(int src, int des){
          matrix[src][des]=1;
          matrix[des][src]=1;
      }
      void breadth(int start){
          visit[start]=true;
          queue[++rear]=start;

          while(front<=rear){
              int node =queue[front++];
              System.out.print(node+" ");

              for(int i=0; i<vert; i++){
                  if(matrix[node][i]==1&& !visit[i]){
                      visit[i]=true;
                      queue[++rear]=i;
                  }
              }
          }
      }

    public static void main(String[] args) {
        BFS graph=new BFS(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);

        System.out.println("BFS Traversal : ");
        graph.breadth(0);
    }

}
