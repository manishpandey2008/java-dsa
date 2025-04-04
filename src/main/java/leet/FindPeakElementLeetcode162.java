package leet;

public class FindPeakElementLeetcode162 {

    private static int solution(int[] arr){
        int l=0;
        int r=arr.length-1;
        while (l<=r){
            int m=(l+r)/2;
            if(arr[m]>arr[m+1] && arr[m]>arr[m-1]){
                return  m;
            }
            if(arr[m-1]>=arr[m+1]){
                r=m;
            }else{
                l=m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,9,8,7,10,5,4};
        System.out.println(solution(arr));
    }
}
