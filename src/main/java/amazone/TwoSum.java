package amazone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        /*
            You are given an array of integers 'ARR' of length 'N' and an integer Target.
            Your task is to return all pairs of elements such that they add up to Target.
         */

        int[] arr={1, 2, 3, 4};
        int target=10;
        Arrays.sort(arr);
        int l=0,r=arr.length-1;
        List<int[]> ans=new ArrayList<>();
        while (l<r){
            int sum=arr[l]+arr[r];
            if (sum>target){
                r--;
            }else if(sum<target){
                l++;
            }else{
                ans.add(new int[]{arr[l],arr[r]});
                r--;
            }
        }

        for (int[] a : ans){
            System.out.println(a[0] +", "+ a[1]);
        }
    }
}
