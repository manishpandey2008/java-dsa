package leet;

import java.util.Arrays;

public class NumberOfEnclavesLeetcode1020 {

    private static int dfs(int[][] arr,boolean[][] visited,int i,int j){
        if(i<0 || j<0 || i==arr.length || j==arr[0].length || visited[i][j] || arr[i][j]==0)return 0;
        visited[i][j]=true;
        return dfs(arr,visited,i+1,j)+dfs(arr,visited,i-1,j) + dfs(arr,visited,i,j+1)+dfs(arr,visited,i,j-1)+1;
    }
    public static void main(String[] args) {
        int[][] arr={
                {0,0,0,0,0},
                {1,0,1,1,0},
                {0,1,1,0,1},
                {0,0,0,1,1}
        };
        boolean[][] visited=new boolean[arr.length][arr[0].length];
        for(boolean[] v :visited) Arrays.fill(v,false);

        int totalBorderLand=0;
        int totalLand=0;

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                totalLand+=arr[i][j];
                if(
                        arr[i][j]==1
                        && !visited[i][j]
                        && (i==0 || j==0 || i==arr.length-1 || j==arr[0].length-1)
                )totalBorderLand+=dfs(arr,visited,i,j);
            }
        }
        System.out.println(totalLand-totalBorderLand);
    }
}
