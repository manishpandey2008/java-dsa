package leet;

import java.util.Arrays;

public class NumberOfClosedLslandsLeetcode1254 {

    private static int dfs(int[][] arr,boolean[][] visited,int i,int j){
        if(i== arr.length || j==arr[0].length || i< 0 || j<0) return 0;

        if(visited[i][j] || arr[i][j]==1) return 1;

        visited[i][j]=true;
        return  Math.min(Math.min(dfs(arr,visited,i+1,j),dfs(arr,visited,i-1,j)), Math.min(dfs(arr,visited,i,j+1),dfs(arr,visited,i,j-1)));
    }

    public static void main(String[] args) {
        int[][] arr={
                {1,1,1,1,1,1,1,0},
                {1,0,0,0,0,1,1,0},
                {1,0,1,0,1,1,1,0},
                {1,0,0,0,0,1,0,1},
                {1,1,1,1,1,1,1,0}
        };
        
        boolean[][] visited=new boolean[arr.length][arr[0].length];
        for(boolean[] tempVi : visited) Arrays.fill(tempVi,false);
        int totalCount=0;
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0 && !visited[i][j]){
                    totalCount+=dfs(arr,visited,i,j);
                }
            }
        }
        System.out.println(totalCount);

    }
}
