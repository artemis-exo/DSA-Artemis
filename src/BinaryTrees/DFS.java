package BinaryTrees;

public class DFS {
    int vert;
    int [][] matrix;
    boolean [] visit;
    int top=-1;
    int [] stack;

    DFS(int val){
        vert=val;
        matrix=new int[val][val];
        visit=new boolean[val];
        stack=new int[val];
    }
    void addEdge(int src, int des){
        matrix[src][des]=1;
        matrix[des][src]=1;
    }
    void push(int val){
        stack[++top]=val;
    }
    int pop(){
        return stack[top--];
    }
    void depth(int start){
        push(start);
        visit[start]=true;

        while(top!=-1){
            int node=pop();
            System.out.print(node+" ");

            for(int i=vert-1; i>0; i--){
                if(matrix[node][i]==1 && !visit[i]){
                    push(i);
                    visit[i]=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS graph=new DFS(5);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);

        System.out.println("DFS Traversal: ");
        graph.depth(0);
    }

}
