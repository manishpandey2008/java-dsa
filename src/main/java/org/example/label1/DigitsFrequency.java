package org.example.label1;

import java.util.Scanner;

public class DigitsFrequency {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int f= scanner.nextInt();
        int count=0;
        while (num>0){
            if(num%10==f)count++;
            num/=10;
        }
        System.out.println(count);

    }
}
