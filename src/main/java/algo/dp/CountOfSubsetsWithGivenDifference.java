package algo.dp;

import java.util.Arrays;

public class CountOfSubsetsWithGivenDifference  {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        int diff = 0;
        int target= Arrays.stream(arr).sum();

        System.out.println(solution(arr,0,0,target,diff)/2);
    }

    private static int solution(int[] arr,int index,int sum, int target,int diff){
        if(arr.length==index){
           return  (Math.abs(target-sum-sum)==diff)?1:0;
        }
        int include=solution(arr,index+1,sum+arr[index],target,diff);
        int exclude=solution(arr,index+1,sum,target,diff);
        return include+exclude;
    }
}
