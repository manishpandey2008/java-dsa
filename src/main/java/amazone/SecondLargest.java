package amazone;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr=new int[]{10,5,10};
//        if(arr.length < 2) return -1;
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int value : arr) {
            if(value > first) {
                second = first;
                first = value;

            } else if(value > second && value != first) {
                second = value;
            }
        }
        System.out.println(second);
    }
}
