package Stacks;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        int[] arr = { 6,8, 0,1,3};
        int[] ng = new int[arr.length];

        //loop backwards
        for (int i = arr.length-1; i >=0 ; i--) {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // if else
            if(s.isEmpty()){
                ng[i]=-1;
            }
            else{
                ng[i]=arr[s.peek()];
            }

            // push to stack
            s.push(i);
        }

        //print array
        for (int i = 0; i < ng.length; i++) {
            System.out.print(ng[i] +" ");
        }
    }
}
