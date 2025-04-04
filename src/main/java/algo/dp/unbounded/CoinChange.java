package algo.dp.unbounded;

public class CoinChange {
    /*
        Given an integer array of coins[] of size n representing different types of denominations and an integer sum, the task is to count all
        combinations of coins to make a given value sum.
        Note: Assume that you have an infinite supply of each type of coin.
     */
    public static void main(String[] args) {
        int[] arr={5,8};
        int sum=12;
        System.out.println(solution(arr,0,0,sum));
    }

    public static int solution(int[] arr, int index, int sum,int target){
        if(index==arr.length){
            return (sum==target)?1:0;
        }
        if(sum>target){
            return 0;
        }
        return solution(arr,index,sum+arr[index],target)+solution(arr,index+1,sum,target);
    }
}
