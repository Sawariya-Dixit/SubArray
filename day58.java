import java.util.Arrays;

public class day58 {

    public static int[] twoSum(int[] numbers, int target) {
        int lp = 0;
        int rp = numbers.length - 1;

        while (lp != rp) {
            if (numbers[lp] + numbers[rp] == target) {
                return new int[]{lp + 1, rp + 1};  // 1-based indexing
            }

            if (numbers[lp] + numbers[rp] < target) {
                lp++;
            } else {
                rp--;
            }
        }

        return new int[]{-1, -1};  // If no solution
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        int res[] = twoSum(arr, target);
        System.out.println(Arrays.toString(res)); 
    }
}
