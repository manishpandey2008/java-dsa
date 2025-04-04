package algo.dp.unbounded;

public class CoinChangeMinimumCoinsToMakeSum {
    /*
        Given an array of coins[] of size n and a target value sum, where coins[i] represent the coins of different denominations.
        You have an infinite supply of each of the coins. The task is to find the minimum number of coins required to make the given value sum.
        If it’s not possible to make a change, return -1.
     */
    public static void main(String[] args) {
        int[] nums={4, 6, 2};
        int sum = 5;
        int res=solution(nums,0,0,sum,0);
        System.out.println(res==Integer.MAX_VALUE?-1:res);
    }

    public static int solution(int[] nums,int index, int sum, int target,int count){
        if(sum==target){
            return count;
        }
        if(index==nums.length || sum>target){
            return Integer.MAX_VALUE;
        }
        return Math.min(solution(nums,index,sum+nums[index],target,count+1),solution(nums,index+1,sum,target,count));
    }
}
