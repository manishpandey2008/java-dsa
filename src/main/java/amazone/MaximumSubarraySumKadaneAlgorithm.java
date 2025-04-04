package amazone;

public class MaximumSubarraySumKadaneAlgorithm {
    public static void main(String[] args) {
//        Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.
        int arr[]=new int[]{5, -4, 1, 7, -8};
        int maxSum=arr[0];
        int currentSum=0;
        for(int i=0;i<arr.length;i++){
            currentSum+=arr[i];
            if(currentSum<0){
                currentSum=arr[i];
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        }

        System.out.println(maxSum);

    }
}
