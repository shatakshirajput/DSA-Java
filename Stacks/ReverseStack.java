package Stacks;

import java.util.*;

public class ReverseStack{
    public static void pushAtBottom(Stack<Integer> s , int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void printStack(Stack<Integer> s) {
        for (int i = s.size() - 1; i >= 0; i--) {
            System.out.print(s.get(i) + " ");
        }
        System.out.println();
    }

    public static void revStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top=s.pop();
        revStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        printStack(s);
        revStack(s);
        printStack(s);
    }
}
