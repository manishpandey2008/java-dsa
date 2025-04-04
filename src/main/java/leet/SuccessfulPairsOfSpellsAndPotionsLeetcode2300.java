package leet;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotionsLeetcode2300 {

    public static int getIndex(int[] positions,int spell,int success){
        int l=0;
        int r=positions.length-1;
        int lastPosition=-1;
        while (l<=r){
            int mid=(r+l)/2;
            if(mid*spell>=success){
                r=mid-1;
                lastPosition=mid;
            }else{
                l=l+1;
            }
        }
     return lastPosition;
    }

    public static void main(String[] args) {
        int[] spells={5,1,3};
        int[] positions={1,2,3,4,5};
        int success=7;
        Arrays.sort(positions);

        for (int d: spells){
            System.out.println(getIndex(positions,d,success));
        }

    }
}
