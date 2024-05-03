package org.example.label1;

import java.util.Scanner;

public class AnyBaseAddition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int base= scanner.nextInt();
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int rem=0;
        String str="";
        while(num1>0 || num2>0){
            int sum=(((num1>0)?num1%base : 0)+((num2>0)?num2%base : 0)+rem);
            str=(sum%base)+str;
            rem=sum/base;
            num1/=10;
            num2/=10;
        }
        if(rem>0)str=rem+str;
        System.out.println(str);
    }
}
