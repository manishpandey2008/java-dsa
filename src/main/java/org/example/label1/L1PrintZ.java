package org.example.label1;

import java.util.Scanner;

public class L1PrintZ {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print((i==0 || i==n-1 || j==(n-i-1))?"*":" ");
            }
            System.out.println();
        }
    }
}
