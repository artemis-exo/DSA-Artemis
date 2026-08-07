package LinkedList;

public class SinglyLL {
    static class Node{
        Node next;
        int val;
        public Node(int val) {
            this.val = val;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    // Constructor

    public SinglyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    // Insert at beginning
    public void insertAtHead(int val) {
        Node newNode = new Node(val);
        // if LL is empty --> head and tail ko newNode pr point krdo
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }
    public void insertAtTail(int val) {
        Node newNode = new Node(val);
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }
    public void insertAtIndex(int index, int val) {
      if(index<0 || index>size+1){
          System.out.println("Insertion Not Possible");
          return;
      }
      if(index==1){
          insertAtHead(val);
          return;
      }
      if(index==size+1){
          insertAtTail(val);
          return;
      }
      // Middle pe khin pe
        Node prevNode = head;
      // move prev Node by (position-2) steps,to reach to the previous node of the destination
        for(int i=1;i<=index-2; i++){
            prevNode=prevNode.next;
        }
        Node newNode = new Node(val);
        // update links
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        // increment size
        size++;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp = temp.next;
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return  head==null;
    }
    public int getHead(){
        if(head==null){
            return -1;
        }
        return head.val;
    }
    public int getTail(){
        if(tail==null){
            return -1;
        }
        return tail.val;
    }
    public static void main(String args[]){
        SinglyLL sll = new SinglyLL();
        if(sll.isEmpty()){
            System.out.println("Empty List");
        }
        System.out.println("Size of LL "+sll.getSize());
        sll.insertAtHead(1);
        sll.print();
        sll.insertAtHead(2);
        sll.print();
        sll.insertAtHead(3);
        sll.print();
        sll.insertAtTail(5);
        sll.print();
        sll.insertAtTail(6);
        sll.print();
        sll.insertAtIndex(4,4);
        sll.print();

        System.out.println("Size of LL "+sll.getSize());
        System.out.println("Head of LL "+sll.getHead());
        System.out.println("Tail of LL "+sll.getTail());

    }
}
