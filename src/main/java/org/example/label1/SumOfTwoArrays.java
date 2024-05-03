package org.example.label1;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        int arr1[]= new int[]{2,5,8,3,4,5,6,2,3};
        int arr2[]=     new int[]{3,5,7,2,5,8,2};
        int l1=arr1.length;
        int l2=arr2.length;
//        int res[]=new int[Math.max(l1,l2)];
        int carry=0;
//        int count=res.length;
        while (l1>0 || l2>0){
            int sum=(l1>0?arr1[l1-1]:0)+(l2>0?arr2[l2-1]:0)+carry;
            System.out.println(sum%10);
            carry=sum/10;
            l1--;l2--;
        }

    }
}
