package algo.dp;

import java.util.Arrays;

public class TargetSum494 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1};
        int target=3;
        int totalSum= Arrays.stream(nums).sum();
        int[][] pre=new int[nums.length+1][totalSum+1];
        for(int[] p : pre)Arrays.fill(p,-1);
        System.out.println(solution(nums,0,target,0,pre));
    }

    private static int solution(int[] nums,int index,int target,int sum,int[][] pre){
        if(nums.length==index){
            return (sum==target)?1:0;
        }

        if(pre[index][sum]!=-1)return pre[index][sum];

        int include=solution(nums,index+1,target,sum+nums[index],pre);
        int exclude=solution(nums,index+1,target,sum-nums[index],pre);
        pre[index][sum]=include+exclude;
        return pre[index][sum];
    }
}
