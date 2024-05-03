package org.example.label1;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String str="(a+b)+(a+c)+(s)";
        Stack<Character> stack=new Stack<>();
        boolean isChecked=true;
        for (char c:str.toCharArray()){
            if(c==')'){
                isChecked=true;
                while (stack.peek()!='('){
                    isChecked=false;
                    stack.pop();
                }
                if(isChecked)break;
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        System.out.println(isChecked);
    }
}
