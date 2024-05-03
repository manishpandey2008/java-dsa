package org.example.label1;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)arr[i]= scanner.nextInt();
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(max<arr[i])max=arr[i];
        }

        for (int i=max;i>0;i--){
            for (int j=0;j<n;j++){
                if(i==arr[j]){
                    System.out.print("*");
                    arr[j]--;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
