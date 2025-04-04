package org.example.label1;

import java.util.Stack;

public class PostfixEvaluationsAndConversions {
    public static void main(String[] args) {
        String str="223*+2+";
        Stack<Integer> valueStack=new Stack<>();
        Stack<String> inStack=new Stack<>();
        Stack<String> preStack=new Stack<>();

        for (char c : str.toCharArray()){
            if(Character.isDigit(c)){
                valueStack.push(Character.getNumericValue(c));
                inStack.push(String.valueOf(c));
                preStack.push(String.valueOf(c));
            }else if(c=='+' || c=='-' || c=='*' || c=='/'){
                int v2=valueStack.pop();
                int v1=valueStack.pop();
                valueStack.push(calculation(v1,v2,c));

                String str2=inStack.pop();
                String str1=inStack.pop();
                inStack.push("(" + str1 + c +str2+")");

                str2= preStack.pop();
                str1=preStack.pop();
                preStack.push(c+ str1 +str2 );
            }
        }

        System.out.println(preStack.peek());
        System.out.println(inStack.peek());
        System.out.println(valueStack.peek());


    }

    static int calculation( int v1,int v2, char operator){
        if(operator=='+')return v1+v2;
        if(operator=='-')return v1-v2;
        if(operator=='*')return v1*v2;
        if(operator=='/')return v1/v2;
        return 0;
    }
}
