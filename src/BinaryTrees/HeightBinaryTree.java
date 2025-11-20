package BinaryTrees;

public class HeightBinaryTree {
    public static void main(String[] args) {
        Node3 root=new Node3(1);
        root.left=new Node3(2);
        root.right=new Node3(3);
        root.left.left=new Node3(4);
        root.left.right=new Node3(5);

        System.out.println("Height of Binary tree :" + Height(root));
    }
    static int Height(Node3 root){
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