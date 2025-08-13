package Stacks;

import java.util.Stack;

public class ReverseString {
    public static String revString(String str){
        Stack<Character> s  = new Stack<>();
        
        // pushing to stack 
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        // creating str builder 
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String str= "abc";
        String res =  revString(str);
        System.out.println(res);;
    }
}
