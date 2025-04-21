import java.util.Arrays;

public class day10 {

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};  // Return kar diya array of indices
                }
            }
        }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4};
        int val = 6;
        System.out.println(Arrays.toString(twoSum(arr, val))); // Fixed: array ko print karne ka sahi tareeka
    }
}
