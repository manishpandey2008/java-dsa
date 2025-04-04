package leet;

public class MinimizeMaximumOfArrayLeetcode2439 {
    public static void main(String[] args) {
        int[] arr= {3,7,1,6};
        int max=3;
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            int avg= (int)Math.ceil((sum+arr[i])/(i+1));
            sum+=arr[i];
            max=Math.max(avg,max);
        }
        System.out.println(max);
    }
}
