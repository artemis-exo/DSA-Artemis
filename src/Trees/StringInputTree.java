package Trees;

import java.util.Scanner;

public class StringInputTree {
    static  class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            String [] arr = new String[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.next();
            }
            Node root=create(arr,0);
            Node hook=insert(root,0);
        }
    }
    public static Node create(String[] arr,int i){
        if(i>=arr.length && arr[i].equals("N")){
            return null;
        }
        Node root=new Node(Integer.parseInt(arr[i]));
        root.left=create(arr,2*i+1);
        root.right=create(arr,2*i+1);
        return root;
    }
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else if (val > root.data) root.right = insert(root.right, val);
        return root;
    }
}
