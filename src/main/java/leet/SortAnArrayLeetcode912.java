package leet;

import java.util.Arrays;

public class SortAnArrayLeetcode912 {

    private static void merge(int[] arr,int start, int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;

        int[] leftArr=new int[n1];
        int[] rightArr=new int[n2];

        for(int i=0;i<n1;i++){
            leftArr[i]=arr[start+i];
        }

        for(int i=0;i<n2;i++){
            rightArr[i]=arr[mid+1+i];
        }

        // merge
        int leftInd=0;
        int rightInd=0;
        int currentIndex=start;

        while (leftInd<n1 && rightInd<n2){
            if(leftArr[leftInd]<=rightArr[rightInd]){
                arr[currentIndex++]=leftArr[leftInd++];
            }else if(leftArr[leftInd]>rightArr[rightInd]){
                arr[currentIndex++]=rightArr[rightInd++];
            }
        }

        while (leftInd<n1){
            arr[currentIndex++]=leftArr[leftInd++];
        }

        while (rightInd<n2){
            arr[currentIndex++]=rightArr[rightInd++];
        }
    }

    private static void mergeSort(int[] arr,int start,int end){
        if(start==end)return;
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,mid,end);
    }

    public static void main(String[] args) {
        int[] arr={5,2,3,1};
        // Merge Short
        mergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
