package amazone;

import java.util.Arrays;

public class ContractorUpdatesOnRoad {
    public static void main(String[] args) {
        double[][] arr={
                {1.6,9.0},
                {8.0,9.0},
                {0.0,1.5}
        };

        Arrays.sort(arr,(a,b)-> {return  a[1]-b[0] > 0 ? 1:-1;});
        double maxVal=arr[0][1]-arr[0][0];
        for(int i=1;i<arr.length;i++){
            double diff= (arr[i][1]-arr[i][0]);
            if(arr[i][0]>arr[i-1][1]){
                if(maxVal<diff)maxVal=diff;
            }else {
                maxVal+=diff;
            }
        }
        System.out.println(maxVal);
    }
}
