package org.example.label1;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                System.out.print((j>=i)?"* ":"  ");
            }
            System.out.println("");
        }
    }
}
