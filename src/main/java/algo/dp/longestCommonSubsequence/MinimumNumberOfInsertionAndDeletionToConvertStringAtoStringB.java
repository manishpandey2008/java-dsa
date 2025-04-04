package algo.dp.longestCommonSubsequence;

import java.util.Arrays;

public class MinimumNumberOfInsertionAndDeletionToConvertStringAtoStringB {
    public static void main(String[] args) {
        String s1 = "leetcode", s2 = "etco";

        // (s1.length()- Lcs) + (s2.length()- Lcs) + LCS
        // s1.length() + s2.length() - lcs

        int m=s1.length(), n= s2.length();
//        int[][] preVal=new int[m+1][n+1];
        // By Recursion
        /*
        for (int[] a:preVal) Arrays.fill(a,-1);
        int lcs=lcs(s1,s2,0,0,preVal);
        System.out.println(m+n-(2*lcs));
         */

        // By Top-Down Approach

        /*
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        preVal[i][j]=1+preVal[i-1][j-1];
                    }else{
                        preVal[i][j]=Math.max(preVal[i-1][j],preVal[i][j-1]);
                    }
                }
            }
            System.out.println(m+n-(2 * preVal[m][n]));
         */

        // By Top-Down Space Optimization Approach

        int[] preVal= new int[n+1];
        int[] currentVal= new int[n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    currentVal[j]=1+preVal[j-1];
                }else{
                    currentVal[j]=Math.max(preVal[j-1],preVal[j]);
                }
            }
            preVal=currentVal;
        }
        System.out.println(m+n-(2 * preVal[n]));
    }

    public static int lcs(String s1, String s2,int i, int j,int[][] preVal){
        if(i==s1.length() || j==s2.length())return 0;

        if(preVal[i][j]!=-1)return preVal[i][j];

        if(s1.charAt(i)==s2.charAt(j)){
            preVal[i][j]= 1+lcs(s1,s2,i+1,j+1,preVal);
        }else{
            preVal[i][j]= Math.max(lcs(s1,s2,i,j+1,preVal),lcs(s1,s2,i+1,j,preVal));
        }
        return preVal[i][j];
    }


}
