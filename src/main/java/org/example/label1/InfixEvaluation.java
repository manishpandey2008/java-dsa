package org.example.label1;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String s="(2+4)*3+3-4+2*4";
        Stack<Integer> operator=new Stack<>();
        Stack<Character> oprents=new Stack<>();

        for(char c : s.toCharArray()){
           if(c=='('){
               oprents.push(c);
           } else if (Character.isDigit(c)) {
               operator.push(Character.getNumericValue(c));
           } else if (c==')') {
               while (oprents.peek()!='('){
                   int v2=operator.pop();
                   int v1=operator.pop();
                   int val=operation(v1,v2,oprents.pop());
                   operator.push(val);
               }
               oprents.pop();
           } else if (c=='+' || c=='-' || c=='*' || c=='/') {
                while(oprents.size()>0 && oprents.peek()!='(' && getPrecedence(c)<=getPrecedence(oprents.peek())){
                    int v2=operator.pop();
                    int v1=operator.pop();
                    int val=operation(v1,v2,oprents.pop());
                    operator.push(val);
                }
               oprents.push(c);
           }
        }

        while (oprents.size()>0){
            int v2=operator.pop();
            int v1=operator.pop();
            int val=operation(v1,v2,oprents.pop());
            operator.push(val);
        }

        System.out.println(operator.peek());

    }

    static int getPrecedence(char operator){
        if(operator=='+'){
            return 1;
        } else if (operator=='-') {
            return 1;
        } else if (operator=='*') {
            return 2;
        } else if (operator=='/') {
            return 2;
        }
        return 0;
    }


    static int operation(int v1,int v2,char operator){
        if(operator=='+'){
            return v1+v2;
        } else if (operator=='-') {
            return v1-v2;
        } else if (operator=='*') {
            return v1*v2;
        } else if (operator=='/') {
            return v1/v2;
        }
        return 0;
    }


}
