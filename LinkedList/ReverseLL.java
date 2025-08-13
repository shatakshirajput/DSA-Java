package LinkedList;

public class ReverseLL {
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

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        ReverseLL ll =new ReverseLL();
        ll.add(0, 1);
        ll.add(1, 2);
        ll.add(2, 3);
        ll.add(3, 4);
        ll.add(4, 5);
        ll.add(5, 6);
        ll.printLL();
        ll.reverse();
        ll.printLL();
    }
}
