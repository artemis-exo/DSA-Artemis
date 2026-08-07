package Graphs;

public class GraphAdClass {
    int V;
    int [][] graph;
    GraphAdClass(int V){
        this.V = V;
        graph = new int [V][V];
    }
    public static void main(String[] args) {
        GraphAdClass g = new GraphAdClass(5);
        g.graph=new  int [][]{
                {0,1,1,0,0},
                {1,0,0,1,0},
                {1,0,0,0,1},
                {0,1,0,0,1},
                {0,0,1,1,0}
        };
        for(int i=0; i<g.V;i++){

        }
    }
}
