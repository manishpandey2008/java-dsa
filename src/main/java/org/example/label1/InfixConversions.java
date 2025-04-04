package org.example.label1;

import java.util.Stack;

public class InfixConversions {
    public static void main(String[] args) {
        String s="2+2*3+2";
        Stack<String> preStr=new Stack<>();
        Stack<String> postStr=new Stack<>();
        Stack<Character> operants=new Stack<>();


        for(char c:s.toCharArray()){
            if(c=='('){
                operants.push(c);
            } else if (c==')') {
                while (operants.peek()!='('){
                    String v2=preStr.pop();
                    String v1=preStr.pop();
                    String oper=operants.pop().toString();
                    String finalVal=oper+v1+v2;
                    preStr.push(finalVal);

                    v2=postStr.pop();
                    v1=postStr.pop();
                    finalVal=v1+v2+oper;
                    postStr.push(finalVal);
                }
                operants.pop();
            } else if (Character.isDigit(c)) {
                preStr.push(String.valueOf(c));
                postStr.push(String.valueOf(c));
            } else if (c=='+' || c=='-' || c=='*' || c=='/') {
                while (operants.size()>0 && operants.peek()!='(' && getPricident(c)<=getPricident(operants.peek())){
                    String v2=preStr.pop();
                    String v1=preStr.pop();
                    String oper=operants.pop().toString();
                    String finalVal=oper+v1+v2;
                    preStr.push(finalVal);

                    v2=postStr.pop();
                    v1=postStr.pop();
                    finalVal=v1+v2+oper;
                    postStr.push(finalVal);
                }
                operants.push(c);
            }
        }

        while (operants.size()>0){
                String v2=preStr.pop();
                String v1=preStr.pop();
                String oper=operants.pop().toString();
                String finalVal=oper+v1+v2;
                preStr.push(finalVal);

                v2=postStr.pop();
                v1=postStr.pop();
                finalVal=v1+v2+oper;
                postStr.push(finalVal);
        }


        System.out.println(preStr.peek());
        System.out.println(postStr.peek());

    }

    static int getPricident(char operator){
        if(operator=='+' || operator =='-')return 1;
        else if (operator=='*' || operator =='/') {
            return 2;
        }
        return 0;
    }

}
