package algo.dp;

import java.util.Arrays;
import java.util.Collections;

public class PartitionEqualSubsetSumLeetCode416 {
    public static void main(String[] args) {
        int[] nums={1,5,11,5};
        int sum= Arrays.stream(nums).sum();
        if(sum%2!=0){
            System.out.println(false);
            return;
        }
        int target=sum/2;
        int[][] memory=new int[nums.length][target];
        for(int i=0;i<memory.length;i++)Arrays.fill(memory[i],-1);
        System.out.println(solution(nums,0,0,target,memory));
    }

    private static boolean solution(int[] nums,int i,int sum,int target,int[][] memory){
        if(i== nums.length)return false;
        if(sum==target)return true;
        if(memory[i][sum]!=-1){
            return memory[i][sum]!=0;
        }
        boolean val=solution(nums,i+1,sum+nums[i],target,memory) || solution(nums,i+1,sum,target,memory);
        memory[i][sum]= val?1:0;
        return val;
    }
}
