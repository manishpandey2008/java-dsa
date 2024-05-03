package org.example.label1;

import java.util.Stack;

public class NextGreaterElementOnTheRight {
    public static void main(String[] args) {
        int[] arr=new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7};
        Stack<Integer> stack=new Stack<>();
        for(int v:arr){
            if(stack.size()>0 && stack.peek()<v){
                while(stack.size()>0 && stack.peek()<v){
                    System.out.println("Next Grater for "+stack.pop()+" is "+v);
                }
                stack.push(v);
            }else{
                stack.push(v);
            }
        }
      while (stack.size()>0){
          System.out.println("Next Grater for "+stack.pop()+" is "+"-1");
      }
    }
}
