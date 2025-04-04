package org.example.label1;

import java.util.Stack;

public class PrefixEvaluationsAndConversion {
    public static void main(String[] args) {
        String str="++2*232";
        Stack<Integer> valStack=new Stack<>();
        Stack<String> inStack=new Stack<>();
        Stack<String> postStack=new Stack<>();

        for (int i=str.length()-1;i>=0;i--){
            if(Character.isDigit(str.charAt(i))){
                valStack.push(Character.getNumericValue(str.charAt(i)));
                inStack.push(String.valueOf(str.charAt(i)));
                postStack.push(String.valueOf(str.charAt(i)));
            } else if (str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='*'  || str.charAt(i)=='/') {
                int v1=valStack.pop();
                int v2=valStack.pop();
                valStack.push(calculation(v1,v2,str.charAt(i)));

                String str1=inStack.pop();
                String str2=inStack.pop();
                inStack.push("("+str1+str.charAt(i)+str2+")");

                str1=postStack.pop();
                str2=postStack.pop();
                postStack.push(str1+str2+str.charAt(i));

            }
        }

        System.out.println(valStack.peek());
        System.out.println(inStack.peek());
        System.out.println(postStack.peek());

    }

    static int calculation(int v1,int v2, char operator){
        if(operator=='+')return v1+v2;
        if(operator=='-')return v1-v2;
        if(operator=='*')return v1*v2;
        if(operator=='/')return v1/v2;
        return 0;
    }
}
