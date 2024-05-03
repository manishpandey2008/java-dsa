package org.example.label1;

import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String str=String.valueOf(num);
        int l=str.length();
        int totalSum=0;
        while (num>0){
            totalSum+=num%10;
            num=num/10;
        }
        if((l*(l+1)/2)!=totalSum){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
