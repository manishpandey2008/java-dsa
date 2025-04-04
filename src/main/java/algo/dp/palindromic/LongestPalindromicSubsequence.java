package algo.dp.palindromic;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String str="cbbd";
        // Formula
        // LongestPalindromicSubsequence(str)= LCS(str, reverse(str))

        StringBuilder strRev=new StringBuilder();
        strRev.append(str);
        strRev.reverse();
        int m=strRev.length();
        int[][] pre=new int[m+1][m+1];
        for(int[] a : pre) Arrays.fill(a,-1);
        System.out.println(solution(str,strRev.toString(),m,0,0,pre));
    }

    private static int solution(String s1, String s2, int m, int i,int j, int[][] preVal){
        if(m==i || m==j)return 0;
        if(preVal[i][j]!=-1)return preVal[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            preVal[i][j]=1+solution(s1,s2,m,i+1,j+1,preVal);
        }else{
            preVal[i][j]=Math.max(solution(s1,s2,m,i,j+1,preVal),solution(s1,s2,m,i+1,j,preVal));
        }
        return preVal[i][j];
    }
}
