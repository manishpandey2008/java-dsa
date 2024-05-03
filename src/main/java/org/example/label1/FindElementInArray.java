package org.example.label1;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)arr[i]= scanner.nextInt();
        int target= scanner.nextInt();
        int i=0;
        for (i=0;i<n;i++) {
            if(arr[i]==target)break;
        }
        System.out.println(i);

    }
}
