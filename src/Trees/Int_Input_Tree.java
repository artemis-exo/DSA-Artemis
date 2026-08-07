package Trees;

import java.util.Scanner;

public class Int_Input_Tree {
    static class Node {
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the values of the tree:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = null;
        for (int i = 0; i < n; i++) {
            root = createNode(root, arr[i]);
        }
        inorder(root);
    }

    public static Node createNode(Node root, int i) {
        if (root == null) {
            return new Node(i);
        }
        if (root.val > i) {
            root.left = createNode(root.left, i);
        }
        if (root.val < i) {
            root.right = createNode(root.right, i);
        }
        return root;
    }
    public  static void inorder(Node root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
