package algo.dp;

import java.util.HashMap;
import java.util.Map;

public class ZeroAndOneKnapsack {
    private static Map<String,Integer> count=new HashMap<>();
    public static void main(String[] args) {
        int[] price={10, 40, 30, 50};
        int[] weight={5, 4, 6, 3};
        int capacity = 15;
        System.out.println(solution(price,weight,capacity,0));
        System.out.println(count);
    }

    public static int solution(int[] price,int[] weight,int capacity,int index){
        if(index==weight.length || capacity==0)return 0;
        count.put(capacity+"$"+index,count.getOrDefault(capacity+"$"+index,0)+1);
        if(capacity>=weight[index]){
            return Math.max(
                    price[index]+solution(price,weight,capacity-weight[index],index+1),
                    solution(price,weight,capacity,index+1)
            );
        }else{
            return solution(price,weight,capacity,index+1);
        }
    }

}
