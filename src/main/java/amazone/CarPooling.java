package amazone;

import java.util.Arrays;

public class CarPooling {
    public static void main(String[] args) {
        /*
            Car Pooling
            You are working as a cab driver. Your car moves in a straight line and moves toward the forward direction only. Initially, you have ‘C’ empty seats for the passengers.
            Now, you are given ‘N’ number of trips that you have to make. In each trip, you are given three integers ‘Num’, ‘pickPoint’, and ‘dropPoint’ denoting that there are ‘Num’ numbers of passengers standing at 'pickpoint’ and you have to drop them at 'droppoint’.
            Your task is to find if it is possible to pick up and drop off all the passengers of all the given trips or not.
         */
        int[][] arr={
                {2,1,5},{3,3,7},{1,5,6}
        };

        Arrays.sort(arr,(a,b)->a[1]-b[2]);

        for (int[] a : arr){
            System.out.println(a[0]+" -> "+a[1]+" -> "+a[2]);
        }

    }
}
