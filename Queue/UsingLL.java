package Queue;

public class UsingLL{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next = null;
        }
    }

    static class Node1{
        int data;
        Node next;

        Node1(int data){
            this.data =data;
            this.next = null;
        }
    }

    static class Queue{
        static Node head ;
        static Node tail;

        //is Empty
        public static boolean isEmpty(){
            return head== null && tail == null;
        }

        // add
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head=tail=newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
        }

        // peek
        public int peek() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        // while (!q.isEmpty()) {
        //     System.out.println(q.peek());
        //     q.remove();
        // }
    }
}