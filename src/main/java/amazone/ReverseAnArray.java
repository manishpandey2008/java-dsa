package amazone;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,6};
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for (int k : arr){
            System.out.println(k);
        }
    }
}
