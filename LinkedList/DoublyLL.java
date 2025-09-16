package LinkedList;

public class DoublyLL {
    public class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }   
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("DL is empty");
            return -1;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val =head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public int removeLast(){
        if(head==null){
            System.out.println("DL is empty");
            return -1;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val =head.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    public void print(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll= new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5 );
        dll.print();
        System.out.println(" "+size);
        dll.removeFirst();
        dll.print();
        System.out.println(" "+size);
        dll.removeLast();
        dll.print();
        System.out.println(" "+size);
    }
}
