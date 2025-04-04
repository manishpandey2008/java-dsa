package amazone;

public class MaximumSumOfNonAdjacentElements {
    public static void main(String[] args) {
        int[] arr={4, 5};
        System.out.println(solution(arr,arr.length-1));
    }

    private static int solution(int[] arr,int index){
        if(index<0)return 0;
        return Math.max(arr[index]+solution(arr,index-2),solution(arr,index-1));
    }
}
