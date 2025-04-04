package algo.dp.longestCommonSubsequence;

import java.util.Arrays;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "wB3232C", s2 = "AB33C";
        int m=s1.length(),n=s2.length();

        // Normal For loop
        /*
            int res=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int count=0;
                    while ((i+count)<m && (j+count)<n &&
                            s1.charAt(i+count) == s2.charAt(j+count)
                    ){
                        count++;
                    }
                    res=Math.max(res,count);
                }
            }
            System.out.println(res);
         */

        // By Recursion
            int[][] pre =new int[m+1][n+1];
            for(int[] a:pre) Arrays.fill(a,-1);
            System.out.println(solutionByRecursion(s1,s2,0,0,pre));

        // By To Down Approach
            /*
              int[][] pre =new int[m+1][n+1];
                int res=0;
                for(int i=1;i<=m;i++){
                    for(int j=1;j<=n;j++){
                        if(s1.charAt(i-1)==s2.charAt(j-1)){
                            pre[i][j]=1+pre[i-1][j-1];
                             res=Math.max(res,pre[i][j]);
                        }else{
    //                        pre[i][j]= Math.max(pre[i][j-1],pre[i-1][j]);
                            pre[i][j]=0;
                        }
                    }
                }
                for(int i=0;i<=m;i++){
                    for(int j=0;j<=n;j++){
                        System.out.print(pre[i][j]+" ");
                    }
                    System.out.println();
                }
    //            System.out.println(pre[m][n]);
            System.out.println(res);
             */

    }


    private static int solutionByRecursion(String s1, String s2, int i, int j, int[][] pre){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }
        if( pre[i][j]!=-1)return  pre[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            pre[i][j]= 1+solutionByRecursion(s1,s2,i+1,j+1,pre) ;
        }else{
            pre[i][j]= Math.max(
                    solutionByRecursion(s1,s2,i,j+1,pre),
                    solutionByRecursion(s1,s2,i+1,j,pre)
            );
        }
        return  pre[i][j];
    }

}
