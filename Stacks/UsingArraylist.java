package Stacks;

import java.util.ArrayList;

public class UsingArraylist {
    static class Stack {
        static ArrayList<Integer> list=new ArrayList<>();

        //is Empty
        public boolean isEmpty(){
            return list.size()==0;
        }

        //push
        public void push(int data){
            list.add(data);
        }

        //pop
        public void pop(){
            if (isEmpty()) {
                System.out.println("Stack is emptyyy");
            }
            list.remove(list.size()-1);
        }

        //peek
        public int peek(){
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s =new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){ 
            System.out.println(s.peek());
            s.pop();
        }
    }
}
