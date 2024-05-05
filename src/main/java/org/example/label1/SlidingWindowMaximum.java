package org.example.label1;

import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] arr=new int[]{2,6,8,3,4,9,12,10,13};
        int[] maxIndex=new int[arr.length];
        int k=4;
        Stack<Integer> stack=new Stack<>();
        stack.push(0);
        maxIndex[0]=0;
        for (int i=1;i<arr.length;i++){
            while (stack.size()>0 && arr[stack.peek()] < arr[i]){
                maxIndex[stack.peek()]=i;
                stack.pop();
            }
            if(stack.size()==0)  maxIndex[i]=i;
           stack.push(i);
        }

        int j=0;
        for (int i=0;i<arr.length-k+1;i++){
            if(j<i){
                j=i;
            }
            while(maxIndex[j] < i+k ){
                j=maxIndex[j];
            }
            System.out.println(arr[j]);
        }
    }
}
