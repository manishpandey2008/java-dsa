package org.example.label1;

import java.util.Scanner;

public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        String string=String.valueOf(num);
        for (char c: string.toCharArray()){
            System.out.println(c);
        }
    }
}
