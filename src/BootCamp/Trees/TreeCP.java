package BootCamp.Trees;

import java.util.*;
public class TreeCP {

    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static Node buildTree(String[] tokens) {
        if (tokens.length == 0 || tokens[0].equals("N") || tokens[0].equalsIgnoreCase("null")) return null;
        Node root = new Node(Integer.parseInt(tokens[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < tokens.length ) {
            Node curr = queue.poll();

            if (i < tokens.length && !tokens[i].equals("N") && !tokens[i].equalsIgnoreCase("null")) {
                curr.left = new Node(Integer.parseInt(tokens[i]));
                queue.add(curr.left);
            }
            i++;

            if (i < tokens.length && !tokens[i].equals("N")&& !tokens[i].equalsIgnoreCase("null")) {
                curr.right = new Node(Integer.parseInt(tokens[i]));
                queue.add(curr.right);
            }
            i++;
        }

        return root;
    }

    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = Integer.parseInt(sc.nextLine().trim());
        String[] tokens = sc.nextLine().trim().split(" ");

        Node root = buildTree(tokens);
        System.out.println(height(root));
    }
}

