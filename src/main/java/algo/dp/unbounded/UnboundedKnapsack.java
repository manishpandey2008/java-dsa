package algo.dp.unbounded;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int[] val={1,60};
        int[] wt={1,55};
        int capacity = 100;
        System.out.println(solution(val,wt,capacity,0));
    }

    private static int solution(int[] val,int[] wt,int capacity,int index){
        if(index==val.length){
            return 0;
        }
        if(wt[index]<=capacity){
            return Math.max( val[index]+ solution(val,wt,capacity-wt[index],index),
                    solution(val,wt,capacity,index+1));
        }else {
            return solution(val,wt,capacity,index+1);
        }
    }
}
