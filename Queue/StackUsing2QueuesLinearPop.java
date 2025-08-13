package Queue;

import java.util.*;

public class StackUsing2QueuesLinearPop {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        void add(int data) {
            q1.add(data); 
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int top = q1.remove(); 
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return top;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            while (q1.size() > 1) {
                q2.add(q1.remove());
            }
            int top = q1.peek();
            q2.add(q1.remove()); 
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.remove();
        }
    }
}

