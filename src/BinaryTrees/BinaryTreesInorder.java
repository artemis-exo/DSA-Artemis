package BinaryTrees;

public class BinaryTreesInorder {
    public static void main(String[] args) {
      Node1 root=new Node1(1);
       root.left=new Node1(2);
       root.right=new Node1(3);
       root.left.left=new Node1(4);
       root.left.right=new Node1(5);
       root.left.right.left=new Node1(6);
       root.right.left=new Node1(7);
       root.right.right=new Node1(8);
       root.right.right.left=new Node1(9);
       root.right.right.right=new Node1(10);

      Inorder(root);
    }
    static void Inorder(Node1 root){
        if(root==null)
            return;
        Inorder(root.left);
        System.out.print(root.val+ "->");
        Inorder(root.right);
    }
}
class Node1{
    int val;
    Node1 left,right;

    Node1(int val){
        this.val=val;
        left=right=null;
    }
}
