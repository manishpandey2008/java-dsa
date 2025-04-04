package algo.dp;

public class NumberOfSubsequencesThatSatisfyTheGivenSumConditionLeet1498 {
    public static void main(String[] args) {
        int[] nums={2,3,3,4,6,7};
        int target=12;
        for (int i=0;i<nums.length;i++){
            System.out.println(solution(nums,i,nums[i],nums[i],target));
        }
    }

    private static int solution(int[] nums,int index,int minVal,int maxVal,int target){
        if(index==nums.length){
            return (minVal+maxVal <= target) ? 1:0;
        }
        if(minVal+maxVal <= target){
            return 1+solution(nums,index+1,Math.min(minVal,nums[index]),Math.max(maxVal,nums[index]),target);
        }else {
            return solution(nums,index+1,minVal,maxVal,target);
        }
    }
}
