package org.example;


import java.util.*;

public class Main {

    static String pi="3.14";
    public static String fainalVal(String val,String res,int i){
        if(i==val.length())return res;
        if((res.length()==0 || res.charAt(res.length()-1)!=val.charAt(i))){
            res+=val.charAt(i);
        }
        return fainalVal(val,res,++i);
    }

    public static int position(int[] arr,int s,int e){
        int pivot=arr[e];
        int index=s-1;
        int j=s;
        while(j<e){
            if(arr[j]<pivot){
              index++;
              swap(arr,index,j);
            }
            j++;
        }
        swap(arr,index+1,e);
        return index+1;
    }

    public static void sort(int[] arr,int s,int e){
        if(s>=e) return;
        int index=position(arr,s,e);
        sort(arr,s,index-1);
        sort(arr,index+1,e);
    }
    public static void swap(int[] arr,int from,int to){
        int temp=arr[from];
        arr[from]=arr[to];
        arr[to]=temp;
    }
    public static void main(String[] args) {
//        int[] arr={3,5,8,2,1,7,3,49,2,4,6};
//        sort(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));
        String text="One time trade";
        String[] words = text.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        System.out.println(builder.toString());

//        Scanner sc = new Scanner(System.in);
//        int testCases = sc.nextInt();
//
//        for (int t = 0; t < testCases; t++) {
//            int n = sc.nextInt();
//            long sum = 0;
//            long prevSum = 0;
//
//            for (int i = 0; i < n; i++) {
//                int currentNumber = sc.nextInt();
//                sum += (long) currentNumber * i - prevSum;
//                prevSum += currentNumber;
//            }
//        }
    }


    public static int solve(int[] arr,int n){
        int sum=0;
        int prevSum=0;
        for (int i = 0; i < n; i++) {
            int currentNumber = arr[i];
            sum += currentNumber * i - prevSum;
            prevSum += currentNumber;
        }
        return sum;
    }
}