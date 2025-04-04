package algo.dp.longestCommonSubsequence;

import java.util.Arrays;

public class ShortestCommonSupersequence {
    public static void main(String[] args) {
        String str1="AGGTAB",str2="GXTXAYB";
        // str1.length() + str2.length() - lcs of str1 and str 2
        int m=str1.length();
        int n= str2.length();
        String[][] preVal=new String[m+1][n+1];
        for (String[] a : preVal) Arrays.fill(a,"");
        System.out.println(solution(str1,str2,m,n,0,0,preVal));
    }


    public static String solution(String s1,String s2,int m,int n, int i, int j,String[][] preVal){
        if(i==m)return s2.substring(j);
        if(j==n)return s1.substring(i);
        if(preVal[i][j]!="")return preVal[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            preVal[i][j]= s1.charAt(i) +solution(s1,s2,m,n,i+1,j+1,preVal);
        }else{
            String t1= s2.charAt(j) + solution(s1,s2,m,n,i,j+1,preVal);
            String t2= s1.charAt(i) + solution(s1,s2,m,n,i+1,j,preVal);
            preVal[i][j]= (t1.length()>t2.length() ?t2 : t1);
        }
        return  preVal[i][j];
    }
}