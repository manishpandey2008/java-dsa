package org.example.label1;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1=new int[]{3,6,8,2,33,5,7,8};
        int[] arr2=       new int[]{7,3,5,6,7};
        int l1=arr1.length;
        int l2=arr2.length;
        int[] res=new int[Math.max(l1,l2)];
        int k=res.length;
        int borrow=0;
        while (l1>0 || l2>0){
            arr1[l1-1]=arr1[l1-1]+borrow;
            if(l2>0&&arr1[l1-1]<arr2[l2-1]){
                arr1[l1-1]=arr1[l1-1]+10;
                borrow=-1;
            }else borrow=0;
            int diff=Math.abs((l1>0?arr1[l1-1]:0)-(l2>0?arr2[l2-1]:0));
//            res[k-1]=diff;
            System.out.println(diff);
            l1--;l2--;k--;
        }


    }
}
