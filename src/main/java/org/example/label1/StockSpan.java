package org.example.label1;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr=new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7};
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.size()>0 && arr[stack.peek()]<arr[i]){
                while(stack.size()>0 && arr[stack.peek()]<arr[i]){
                    System.out.println(arr[stack.peek()]+" -> "+(i-stack.peek()));
                    stack.pop();
                }
                stack.push(i);
            }else{
                stack.push(i);
            }
        }

    }
}
