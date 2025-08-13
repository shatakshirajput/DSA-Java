package Queue;

import java.util.*;

public class QueueUsing2StacksLinearPop {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }

        void add(int data){
            s1.push(data);
        }

        int remove(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }

        int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
    }
    
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
