package BinaryTrees;

public class BinaryTreesPre {
    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(10);
        root.right=new Node(15);
        root.left.left=new Node(20);
        root.left.right=new Node(25);

        preorder(root);
    }
    static void preorder(Node root){
        if(root==null)
            return;
        System.out.print(root.val +"->");

        preorder(root.left);
        preorder(root.right);
    }
}
class Node{
    int val;
    Node left,right;

    Node(int val){
        this.val=val;
        left=right=null;
    }
}