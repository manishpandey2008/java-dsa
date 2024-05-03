package org.example.label1;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int targetBase= scanner.nextInt();
        String str="";
        while(num>0){
            str=(num%targetBase)+str;
            num/=targetBase;
        }
        System.out.println(str);
    }
}
