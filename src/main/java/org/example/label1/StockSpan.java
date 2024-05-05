package org.example.label1;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr=new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] res=new int[arr.length];
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        res[0]=1;
        for(int i=1;i<arr.length;i++){
            while(stack.size()>0 && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            if(stack.size()==0){
                res[i]=i+1;
            }else {
                res[i]=i-stack.peek();
            }
        }
        for (int i : res){
            System.out.println(i);
        }
    }
}
