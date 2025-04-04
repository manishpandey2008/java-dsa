package algo.dp.longestCommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubsequenceByTopDown {
    public static void main(String[] args) {
        String s1="ABC";
        String s2="ACB";
        int l1=s1.length();
        int l2=s2.length();
        int[][] preArr=new int[l1+1][l2+1];

        for(int i=1;i<=l1;i++){
            for (int j=1;j<=l2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    preArr[i][j]=1+preArr[i-1][j-1];
                }else{
                    preArr[i][j]=Math.max(
                            preArr[i][j-1],
                            preArr[i-1][j]
                    );
                }
            }
        }
        System.out.println(preArr[l1][l2]);
    }
}
