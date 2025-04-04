package algo.dp;

import java.util.Arrays;

public class ZeroAndOneKnapsackByMemoization {
    public static void main(String[] args) {
        int[] price={10, 40, 30, 50};
        int[] weight={5, 4, 6, 3};
        int capacity = 15;
        int[][] memory=new int[price.length][capacity+1];
        for(int i=0;i<price.length;i++){
            Arrays.fill(memory[i],-1);
        }
        System.out.println(solution(price,weight,capacity,0,memory));
    }

    public static int solution(int[] price,int[] weight,int capacity,int index,int[][] memory){
        if(index==weight.length || capacity==0)return 0;
        if(memory[index][capacity]!=-1)return memory[index][capacity];
        if(capacity>=weight[index]){
            memory[index][capacity]= Math.max(
                    price[index]+solution(price,weight,capacity-weight[index],index+1,memory),
                    solution(price,weight,capacity,index+1,memory)
            );
        }else{
            memory[index][capacity]= solution(price,weight,capacity,index+1,memory);
        }
        return memory[index][capacity];
    }
}
