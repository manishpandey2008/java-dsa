package algo.dp.longestCommonSubsequence;

import java.util.Arrays;

public class PrintingLongestCommonSubsequence {
    public static void main(String[] args) {
        String s1="AGGTAB",s2="GXTXAYB";
        int m=s1.length(),n=s2.length();
        String[][] preVal=new String[m+1][n+1];

        for (String[] a: preVal) Arrays.fill(a,"-");
        System.out.println(solution(s1,s2,m,n,0,0,preVal));
        System.out.println("Count : "+count);

        // By Top down Approach
    }

    static int count=0;


    public static String solution(String s1,String s2,int m, int n, int i,int j, String[][] preVal){
        count++;
        if(m==i || n==j){
            return "";
        }
        if(!preVal[i][j].equals("-")){
            return preVal[i][j];
        }

        if(s1.charAt(i) == s2.charAt(j)){
            preVal[i][j]= s1.charAt(i)+solution(s1,s2,m,n,i+1,j+1,preVal);
        }else{
            String includeFirst= solution(s1,s2,m,n,i+1,j,preVal);
            String includeSecond= solution(s1,s2,m,n,i,j+1,preVal);
            preVal[i][j]= (includeFirst.length()>includeSecond.length()) ? includeFirst: includeSecond;
        }
        return preVal[i][j];
    }
}
