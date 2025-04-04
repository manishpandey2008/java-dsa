package amazone;

import java.util.PriorityQueue;

public class MinimumNumberOfPlatformNeeded {
    public static void main(String[] args) {
        //You are given the arrival and departure times of N trains at a railway station in a day.
        // You need to find the minimum of platforms required for the railway station such that no train waits i.e No train should wait for the platform to be clear or free.

        int[] arr={800, 810, 820, 830 };
        int[] dep={850, 900, 910, 1000 };

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int count=1;
        for(int i=0;i<arr.length;i++){
            while (!pq.isEmpty()){
                if(pq.peek() < arr[i]){
                    pq.poll();
                }else break;
            }
            pq.add(dep[i]);
            count=Math.max(count,pq.size());
        }

        System.out.println(count);


    }
}
