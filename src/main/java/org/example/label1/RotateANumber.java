package org.example.label1;

import java.util.Scanner;

public class RotateANumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        String numStr=String.valueOf(num)+String.valueOf(num);
        int numOfRotation= scanner.nextInt();
        int lengthOfString=numStr.length()/2;
        numOfRotation=numOfRotation%lengthOfString;
        System.out.println(numStr.substring(numOfRotation,numOfRotation+lengthOfString));
    }
}
