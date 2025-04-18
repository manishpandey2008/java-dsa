package amazone;

public class PrintGivenMatrixInSpiralForm {
    public static void main(String[] args) {
//        Given a matrix mat[][] of size m x n, the task is to print all elements of the matrix in spiral form.
        int[][] mat=new int[][]{
                {1,    2,   3,   4},
                {5,    6,   7,   8},
                {9,   10,  11,  12},
                {13,  14,  15,  16}
        };

        int left=0;
        int right=mat[0].length-1;
        int top=0;
        int bottom=mat.length-1;
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; ++i) {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; ++i) {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }
    }
}
