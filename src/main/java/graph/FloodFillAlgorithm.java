package graph;

public class FloodFillAlgorithm {

    public static void solution(int[][] arr,int i,int j, int updatedVal){
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length || arr[i][j]==0 || arr[i][j]==updatedVal)return;
        arr[i][j]=updatedVal;
        solution(arr,i+1,j,updatedVal);
        solution(arr,i,j+1,updatedVal);
        solution(arr,i-1,j,updatedVal);
        solution(arr,i,j-1,updatedVal);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {0, 0, 0},
                {0, 1, 1}
        };

        solution(arr,0,0,3);

        for (int[] a: arr){
            for (int i : a){
                System.out.print(i+" ,");
            }
            System.out.println();
        }

    }
}
