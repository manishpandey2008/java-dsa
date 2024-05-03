package org.example.label1;

import java.util.Scanner;

public class GcdAndLCM {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int orgNum1=num1;
        int orgNum2=num2;

        while (num1%num2!=0){
            int rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        System.out.println(num2); // GCD
        System.out.println((orgNum1*orgNum2)/num2);
    }
}
