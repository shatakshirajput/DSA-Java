package Stacks;

import java.util.*;

public class ValidParentheses{
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else if(!s.isEmpty() && 
                ((ch == ')' && s.peek() == '(') ||
                (ch == '}' && s.peek() == '{') ||
                (ch == ']' && s.peek() == '['))){
                    s.pop();
            }
            else{
                return false;
            }
        }
        if (s.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str= "{[]{{}()}[]}";
        System.out.println(isValid(str));
        String s1= "[][][]{()]}";
        System.out.println(isValid(s1));
        String s2= "{}";
        System.out.println(isValid(s2));
    }
}