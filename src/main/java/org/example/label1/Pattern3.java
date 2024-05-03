package org.example.label1;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num= scanner.nextInt();
        for(int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                System.out.print((j>=(num+1-i))? "* ":"  ");
            }
            System.out.println("");
        }
    }
}
