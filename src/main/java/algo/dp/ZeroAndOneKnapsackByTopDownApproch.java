package algo.dp;

import java.util.Arrays;

public class ZeroAndOneKnapsackByTopDownApproch {
    public static void main(String[] args) {
        int[] price={10, 40, 30, 50};
        int[] weight={5, 4, 6, 3};
        int capacity = 15;
        int[][] memory=new int[price.length+1][capacity+1];

        // Base case
        for(int i=0;i<=price.length;i++){
            memory[i][0]=0;
        }
        for(int i=0;i<=capacity;i++){
            memory[0][i]=0;
        }

        // Main code
        for(int i=1;i<=price.length;i++){
            for(int w=1;w<=capacity;w++){
                if(w >= weight[i-1]){
                    memory[i][w]=Math.max(price[i-1]+memory[i-1][w-weight[i-1]],memory[i-1][w]);
                }else{
                    memory[i][w]=memory[i-1][w];
                }
            }
        }
        System.out.println(memory[price.length][capacity]);
    }
}
