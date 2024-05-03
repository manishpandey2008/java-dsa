package org.example.label1;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int dev=2;
        while (num>0){
            if(dev>num/2)break;
            if(num%dev!=0){
                dev++;
                continue;
            }
            num=num/dev;
            System.out.print(dev +" ");
        }
    }
}
