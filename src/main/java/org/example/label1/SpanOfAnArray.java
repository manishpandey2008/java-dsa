package org.example.label1;

import java.util.Scanner;

public class SpanOfAnArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[]{3,7,2,22,67,35,6};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(min>arr[i])min=arr[i];
            if(max<arr[i])max=arr[i];
        }
        System.out.println(Math.abs(max-min));
    }
}
