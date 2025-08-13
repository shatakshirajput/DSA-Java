package LinkedList;

public class IterativeSearch {
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

    public int itrSearch(int key){
        int i =0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args) {
        IterativeSearch ll =new IterativeSearch();
        ll.add(0, 1);
        ll.add(1, 2);
        ll.add(2, 3);
        ll.add(3, 4);
        ll.add(4, 5);
        ll.add(5, 6);
        ll.printLL();
        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
    }
}
