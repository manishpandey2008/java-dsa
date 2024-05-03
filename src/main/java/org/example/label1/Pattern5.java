package org.example.label1;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i<=num/2){
                    System.out.print((j>((num/2)-i)&&j<((num/2)+i))?"* ":"  ");
                }else{
                    System.out.print((j>(i-(num/2)) && j<(i+(num/2)))?"* ":"  ");
                }
            }
            System.out.println();
        }
    }
}
