package LinkedList;

public class Palindrome {
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

    public Node findMid(Node head){
        Node slow =head;
        Node fast= head;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //step 1
        Node midNode=findMid(head);

        //step 2
        Node prev=null;
        Node curr=midNode;
        while (curr!=null) {
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        //step 3
        Node right=prev;
        Node left=head;

        while (right!=null) {
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Palindrome ll =new Palindrome();
        ll.add(0, 1);
        ll.add(1, 2);
        ll.add(2, 3);
        ll.add(3, 2);
        ll.add(4, 1);
        System.out.println(ll.checkPalindrome());
    }
}
