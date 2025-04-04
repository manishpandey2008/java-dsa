package amazone;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1, 2, 3, 4, 5};
        int d=2;
        d %= arr.length;
        reverse(arr, 0, arr.length - 1);  // 5,4,3,2,1
        reverse(arr, arr.length - d, arr.length-1); // 5,4,3,1,2
        reverse(arr, 0, arr.length - d-1);
    }

    public static void reverse(int[] nums, int i, int j) {
        int lo = i;
        int hi = j;
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
