package algo.dp;

public class CountOfSubsetsWithSumEqualToTarget {
    public static void main(String[] args) {
        int[] nums={1, 1, 1, 1};
        int target = 1;
        System.out.println(solution(nums,0,0,target));
    }

    private static int solution(int[] nums,int index,int sum,int target){
        if(index==nums.length){
            return (sum==target) ? 1:0;
        }
        return solution(nums,index+1,sum+nums[index],target) + solution(nums,index+1,sum,target);
    }
}
