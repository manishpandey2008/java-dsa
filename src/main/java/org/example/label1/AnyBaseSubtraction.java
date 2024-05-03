package org.example.label1;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int base= scanner.nextInt();
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        // num1> num2
        int bow=0;
        String val="";
        while(num1> 0 || num2>0){
            int first=num1>0 ? (((num1%10) + bow)):0;
            int second=num2>0? (num2%10):0;
            if(second>first){
                bow=-1;
                first+=base;
            }else bow=0;
            val=(first-second)+val;
            num1/=10;
            num2/=10;
        }

        System.out.println(val);
    }
}
