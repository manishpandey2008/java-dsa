package amazone;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] nums=new int[]{3,4,1,4,5};
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        for(int k: nums){
            System.out.println(k);
        }

    }
}
