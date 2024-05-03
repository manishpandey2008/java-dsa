package org.example.label1;

import java.util.Scanner;

public class L2NumberPrime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        boolean check=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)check=false;
        }
        System.out.println(check);
    }
}
