package org.example.label1;

import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        if(isTriplets(num1,num2,num3) ||
                isTriplets(num3,num1,num2)||
                isTriplets(num1,num3,num2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static boolean isTriplets(int b, int l, int h){
        return Math.pow(b,2)+Math.pow(l,2)==Math.pow(h,2);
    }
}
