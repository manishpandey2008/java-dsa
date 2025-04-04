package algo.dp;

import java.util.Arrays;

public class MinCostClimbingStairsLeet746 {
    public static void main(String[] args) {
        int[] arr={2,4,8,1};
        int n= arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int val1=solution(arr,n-1,dp);
        int val2=solution(arr,n-2,dp);

        System.out.println(Math.min(val1,val2));
    }

    private static int solution(int[] arr,int n,int[] dp){
        if(n<0)return 0;
        if(n==0 || n==1)return arr[n];
        if(dp[n]!=-1)return dp[n];
        dp[n]=arr[n]+Math.min(solution(arr,n-1,dp),solution(arr,n-2,dp));
        return dp[n];
    }
}
