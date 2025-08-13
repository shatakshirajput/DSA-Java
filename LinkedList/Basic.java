package LinkedList;

public class Basic {
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

    public void addFirst(int data){
        // Step 1 create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            //empty ll
            head=tail=newNode;
            return;
        }
        
        // Step 2 new node's next=head
        newNode.next=head;

        // Step 3 head = new node
        head=newNode;
    }

    public void addLast(int data){
        // Step 1 create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            //empty ll
            head=tail=newNode;
            return;
        }
        
        // Step 2 tail's next =new node
        tail.next=newNode;

        // Step 3 tail = new node
        tail=newNode;
    }

    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i =0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        //i=idx-1 , temp-> prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return 0;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return 0;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev = size-2;
        Node prev=head;
        for(int i =0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
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

    public static void main(String args[]){
        Basic ll= new Basic();
        ll.printLL();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.printLL();
        System.out.println("Size of the ll : "+size);
        ll.removeFirst();
        ll.removeLast();
        ll.printLL();
        System.out.println("Size of the ll : "+size);
    }
}
