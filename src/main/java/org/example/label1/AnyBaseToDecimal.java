package org.example.label1;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int base= scanner.nextInt();
        int count=0;
        int finalVal=0;
        while(num>0){
            int rem=num%10;
            finalVal+= (int)(rem*Math.pow(base,count));
            count++;
            num/=10;
        }
        System.out.println(finalVal);
    }
}
