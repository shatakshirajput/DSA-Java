package LinkedList;

public class RecursiveSearch {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add(int idx,int data){
        Node newNode=new Node(data);
        size++;
        if(idx==0){
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        int i =0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void printLL(){
        if(head==null){
            System.out.println("Linked List is empty...");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }System.out.println("null");
    }

    public int helper(Node head,int key){
        //base case
        if (head==null) {
            return -1;
        }
        //if found on head
        if(head.data==key){
            return 0;
        }
        //for other heads (smaller ll)
        int idx= helper(head.next, key);
        // not found
        if (idx==-1) {
            return -1;
        }
        // return original index
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    public static void main(String[] args) {
        RecursiveSearch ll =new RecursiveSearch();
        ll.add(0, 1);
        ll.add(1, 2);
        ll.add(2, 3);
        ll.add(3, 4);
        ll.add(4, 5);
        ll.add(5, 6);
        ll.printLL();
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
    }
}
