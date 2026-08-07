package Mock;
import java.util.*;
import java.util.ArrayList;
import java.io.*;

public class First {

    static class Pair{
        Node node ;
        int hd;
        Pair(Node x, int y){
            this.node =x;
            this.hd=y;
        }
    }

    static class Node{
    int data;
    Node left;
    Node right;
    public Node(int value) {
        this.data = value;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node root=null;
        for(int i=0;i<n;i++){
            root=createNode(root,arr[i]);
        }
        System.out.println( height(root));
        levelOrder(root);
        topView(root);
    }
    public static Node createNode(Node root,int i ){
       if(root==null){
           return new Node(i);
       }
       if(root.data>i){
           root.left=createNode(root.left,i);
       }
       else if(root.data<i){
           root.right=createNode(root.right,i);
       }
       return root;
    }
    public static int height(Node root){
        if(root==null){
            return -1;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
    public static void levelOrder(Node  root) {
       List<Integer> list=new ArrayList<>();
       Queue<Node> queue=new LinkedList<>();
       queue.add(root);
       if(root==null){
           return;
       }
       while(!queue.isEmpty()){
           int size=queue.size();
           for(int i=0;i<size;i++){
               Node temp=queue.poll();
               System.out.println(temp.data+"");
               if(temp.left!=null){
                   queue.add(temp.left);
               }
               if(temp.right!=null){
                   queue.add(temp.right);
               }
           }
       }
       System.out.println(list);
    }
    public static void topView(Node root) {
        if (root == null) {
            return;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            Node node = pair.node;
            int hd = pair.hd;

            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

            if (node.left != null) {
                queue.add(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, hd + 1));
            }
        }

        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
    }

}
