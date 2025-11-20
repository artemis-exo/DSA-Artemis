package BinaryTrees;

public class HeightBinaryTree {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.println("Height of Binary tree :" + Height(root));
    }
    static int Height(Node root){
        if(root==null)
            return 0;
        int LH=Height(root.left);
        int RH=Height(root.left);

        return 1+ Math.max(LH,RH);

    }
}
class Node3{
    int val;
    Node3 left,right;

    Node3(int val){
        this.val=val;
    }
}