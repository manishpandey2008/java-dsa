package org.example.codeninja;

public class MaxSymOfKSubarray {
    public static void main(String[] args) {
        int arr1[]=new int[]{10,20,30};
        int arr2[]=new int[]{10,15,20,5,50,110,89};
        int i=0,j=0;
        while(i< arr1.length && j<arr2.length){
            if(arr1[i]<=0){
                i++;continue;
            }
            if(arr2[j]<=0){
                j++;continue;
            }
            if(arr1[i]<arr2[j]){
                arr2[j]=arr2[j]-arr1[i];
                arr1[i]=0;
                i++;
            }else if(arr1[i]==arr2[j]){
                arr2[j]=0;
                arr1[i]=0;
                i++;j++;
            }else{
                arr1[i]=arr1[i]-arr2[j];
                arr2[j]=0;
                j++;
            }
        }

        for (int k=0;k<arr2.length;k++){
            System.out.println(arr2[k]);
        }
        System.out.println("---------------------------");
        for (int k=0;k<arr1.length;k++){
            System.out.println(arr1[k]);
        }

    }
}
