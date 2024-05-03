package org.example.label1;

import java.util.List;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String str="(a+b)+({))";
        Stack<Character> stack=new Stack<>();
        boolean check=false;
        for (char c:str.toCharArray()){
           if(c==')' && stack.peek()=='('){
               stack.pop();
           }else if(c=='}' && stack.peek()=='{'){
               stack.pop();
           }else if(c==']' && stack.peek()=='['){
               stack.pop();
           }else if(c=='('||c=='{'||c=='[')stack.push(c);
        }
        System.out.println(stack.size());
    }
}
