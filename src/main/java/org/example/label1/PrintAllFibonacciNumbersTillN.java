package org.example.label1;

import java.util.Scanner;

public class PrintAllFibonacciNumbersTillN {
    public static void main(String[] args) {
        System.out.println("Print all Fibonacci Numbers till N");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int currentNum=0;
        int nextNum=1;
        System.out.print(currentNum+" ");
        System.out.print(nextNum+" ");
        while (n-->2){
            int temp=nextNum+currentNum;
            currentNum=nextNum;
            nextNum=temp;
            System.out.print(temp+" ");
        }

    }
}
