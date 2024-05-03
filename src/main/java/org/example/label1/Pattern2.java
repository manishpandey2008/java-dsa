package org.example.label1;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        for (int i=num;i>0;i--){
            for (int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
