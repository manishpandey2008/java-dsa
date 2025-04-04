package algo.dp.unbounded;

public class RodCutting {
    public static void main(String[] args) {
        int[] arr={3};
        System.out.println(solution(arr,0,arr.length));
    }

    private static int solution(int[] arr,int index, int remainingLength){
        if(index==arr.length || remainingLength<=0)return 0;

        if(remainingLength>=(index+1))
        return Math.max(
                arr[index]+solution(arr,index,remainingLength-index-1),
                solution(arr,index+1,remainingLength)
        );
        else
            return solution(arr,index+1,remainingLength);
    }

}
