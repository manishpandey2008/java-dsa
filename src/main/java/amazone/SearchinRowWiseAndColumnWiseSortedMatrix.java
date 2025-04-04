package amazone;

public class SearchinRowWiseAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
//        Given an N X N matrix and an integer X, find the position of X in the matrix if it is present. Otherwise, print “Element not found”. Every row and column of the matrix is sorted in increasing order.

        int[][] arr=new int[][]{
                                    {10, 20, 30, 40},
                                    {15, 25, 35, 45},
                                    {27, 29, 37, 48},
                                    {32, 33, 39, 50}
                                };
        int i=0;
        int j= arr.length-1;
        int l= arr.length;
        int k=100;

        while(i< l && j >= 0 ){
            if(arr[i][j]==k){
                break;
            }
            System.out.println(arr[i][j]);
            if(arr[i][j]>k){
                j--;
            }else{
                i++;
            }
        }

        System.out.println(i+" , "+j);
    }
}
