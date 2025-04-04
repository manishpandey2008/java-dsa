package leet;

import java.util.Arrays;

public class SurroundedRegionsLeetCode130 {
    public static void main(String[] args) {
        char[][] board={
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };

        boolean[][] visit=new boolean[board.length][board[0].length];

        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                if(!visit[i][j] && board[i][j]=='O'
                && (i==0 || j==0 || i==board.length-1 || j==board[0].length-1)
                ){
                    dfs(board,i,j,visit);
                }

            }
        }

        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++) {
                if(!visit[i][j] && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }

        for(int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }




    }

    public static void dfs(char[][] board,int i, int j,boolean[][] visit){
        if(i<0 || j<0 || i==board.length || j==board[0].length || visit[i][j] || board[i][j]=='X')return;
        visit[i][j]=true;
        dfs(board,i-1,j,visit);
        dfs(board,i+1,j,visit);
        dfs(board,i,j-1,visit);
        dfs(board,i,j+1,visit);

    }
}
