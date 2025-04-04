package leet;

public class NumberOfIslandsLeet200 {
    public static void main(String[] args) {
        char[][] grid ={
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        int res=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    res++;
                    solution(grid,i,j);
                }
            }
        }
        System.out.println(res);
    }

    public static void solution(char[][] grid,int i, int j){
        if(i<0 || j<0 || i== grid.length || j==grid[0].length || grid[i][j]=='0')return;
        grid[i][j]='0';
        solution(grid,i+1,j);
        solution(grid,i-1,j);
        solution(grid,i,j+1);
        solution(grid,i,j-1);

    }
}
