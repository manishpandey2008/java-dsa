package algo.dp;

import java.util.Arrays;

public class PartitionAsetIntoTwoSubsetsSuchThatTheDifferenceOfSubsetSumsIsMinimum {
    public static void main(String[] args) {
        int[] nums={1, 5, 11, 5};
        int target= Arrays.stream(nums).sum();
        int[][] pre=new int[nums.length+1][target+1];
        for(int[] p: pre)Arrays.fill(p,-1);

        System.out.println(solution(nums,0,target,0,pre));

    }

    private static int solution(int[] nums,int index,int target,int sum, int[][] pre){
        if(index==nums.length){
            return Math.abs((target-sum)-sum);
        }
        if(pre[index][sum]!=-1){
            return pre[index][sum];
        }

        int include=solution(nums,index+1,target,sum+nums[index],pre);
        int exclude=solution(nums,index+1,target,sum,pre);
        pre[index][sum]=Math.min(include,exclude);
        return pre[index][sum] ;
    }
}
