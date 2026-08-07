package BootCamp.Trees;

import java.util.*;
public class Mock1_ques2 {
    static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data)
            root.left = insert(root.left, val);
        else if (val > root.data)
            root.right = insert(root.right, val);
        return root;
    }

    static boolean search(Node root, int target) {
        if (root == null) return false;
        if (root.data == target) return true;
        if (target < root.data) return search(root.left, target);
        return search(root.right, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] tokens = sc.nextLine().trim().split(" ");
        int x = Integer.parseInt(sc.nextLine().trim());

        Node root = null;
        for (String token : tokens)
            root = insert(root, Integer.parseInt(token));

        System.out.println(search(root, x) ? "Found" : "Not Found");
    }
}

