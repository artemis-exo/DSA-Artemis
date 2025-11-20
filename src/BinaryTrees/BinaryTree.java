package BinaryTrees;
import java.util.Scanner;
public class BinaryTree {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node5 root=create();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }
    static Node5 create(){
        Node5 root=null;
        System.out.println("enter value");
        int val=sc.nextInt();
        if(val==-1)
            return null;
        root=new Node5(val);
        System.out.println("Enter left tree data");

        root.left=create();
        System.out.println("Enter right tree data");
        root.right=create();
        return  root;
    }
    static  void inorder(Node5 root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.val+ "->");
        inorder(root.right);
    }
    static  void preorder(Node5 root){
        if(root==null)
            return;
        System.out.print(root.val+ "->");
        inorder(root.left);
        inorder(root.right);
    }
    static  void postorder(Node5 root){
        if(root==null)
            return;
        inorder(root.left);
        inorder(root.right);
        System.out.print(root.val+ "->");
    }
}
class Node5{
    int val;
     Node5 left, right;

     Node5(int val){
         this.val=val;
     }
}
