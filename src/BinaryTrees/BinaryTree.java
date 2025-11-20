package BinaryTrees;
import java.util.Scanner;
public class BinaryTree {
    static Scanner sc=null;
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node5 root=create();
        System.out.print("This is Inorder ");
        inorder(root);
        System.out.println();
        System.out.print("This is Preorder ");
        preorder(root);
        System.out.println();
        System.out.print("This is Postorder ");
        postorder(root);
        System.out.println();
        System.out.print("Height of Tree is : "+Height(root));
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

    static int Height(Node5 root){
        if(root==null)
            return 0;
        int LH=Height(root.left);
        int RH=Height(root.right);
        return Math.max(LH,RH)+1;
    }
}
class Node5{
    int val;
     Node5 left, right;

     Node5(int val){
         this.val=val;
     }
}
