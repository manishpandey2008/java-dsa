package algo.DivideAndConquer;

public class MergeSort {

    private static void sort(int[] arr,int l,int r){
        if(l>=r)return;
        int mid= (l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private static void merge(int[] arr,int l,int mid,int r){
        int m=mid-l+1;
        int n=r-mid;
        int[] letArr=new int[m];
        int[] rightArr=new int[n];

        for (int i = 0; i < m; ++i)
            letArr[i] = arr[l + i];
        for (int j = 0; j < n; ++j)
            rightArr[j] = arr[mid + 1 + j];
        int i=0,j=0,k=l;

        while (i<m && j<n){
            if(letArr[i]<rightArr[j]){
                arr[k]=letArr[i];
                i++;
                k++;
            }else{
                arr[k]=rightArr[j];
                j++;
                k++;
            }
        }
        while (i<m){
            arr[k]=letArr[i];
            i++;
            k++;
        }
        while (j<m){
            arr[k]=rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        int[] arr={2,5,8,1,29,3,23,3};
        sort(arr,0,arr.length-1);

        for(int a:arr){
            System.out.println(a);
        }
    }
}
