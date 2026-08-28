import java.util.Scanner;

public class SegmentTree_Node {
    static class SegmentTree{
        int start,end,sum;
        SegmentTree left,right;

        SegmentTree(int start, int end){
            this.start=start;
            this.end=end;
            this.sum=0;
            this.left=this.right=null;
        }
    }
    static SegmentTree root;
    public static SegmentTree buildSegmentTree(int [] arr,int start, int end){
        SegmentTree node=new SegmentTree(start,end);
        if(start==end){
           node.sum=arr[start];
           return node;
        }
        int mid=start+(end-start)/2;
        node.left=buildSegmentTree(arr,start,mid);
        node.right=buildSegmentTree(arr,mid+1,end);
        node.sum=node.left.sum+node.right.sum;
        return node;
    }
    public static void update(SegmentTree node, int idx, int val){
        if(node.start==node.end){
            node.sum=val;
            return;
        }
        int mid= node.start+(node.end-node.start)/2;
        if(idx<=mid){
            update(node.left,idx,val);
        }
        else{
            update(node.right,idx,val);
        }
        node.sum=node.left.sum+node.right.sum;
    }
    public static  int query(SegmentTree node,int l, int r){
        if(node==null || node.start>r || node.end<l){
            return 0;
        }
        if(l<=node.start&&r>=node.end){
            return node.sum;
        }
        return query(node.left,l,r)+query(node.right,l,r);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the Array elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        root=buildSegmentTree(arr,0,n-1);
        System.out.println("Segment Tree Build Successfully ");

        System.out.println("Enter the number of Operations ");
        int q=sc.nextInt();
        System.out.println("For each operations enter: ");
        System.out.println(" 1 l r  -->  range sum query  [l,r] ");
        System.out.println(" 2 idx val  -->  point update arr[idx]=val ");

        for(int i=0; i<q;i++){
            int type=sc.nextInt();
            if(type==1){
                int l=sc.nextInt();
                int r=sc.nextInt();
                if(l<0 ||r>=n || l>r ){
                    System.out.println("Invalid range ");
                    continue;
                }
                System.out.println("Sum of ["+l+","+r+"] is "+query(root,l,r));
            }
            else if(type==2){
                int idx=sc.nextInt();
                int val=sc.nextInt();
                if(idx<0 || idx>=n){
                    System.out.println("Invalid index! ");
                    continue;
                }
                update(root,idx,val);
                System.out.println("Updated arr[" +idx+ "] = "+val);
            }
            else{
                System.out.println("Invalid Operation type! ");
            }
        }
    }
}
