 public class dsa{
public static void Print(int array[]) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < array.length; i++) {
        int start = i;

        for (int j = i; j < array.length; j++) {
            int end = j;
            int sum = 0;  // Reset sum for each subarray

            for (int k = start; k <= end; k++) {
                System.out.print(array[k] + " ");
                sum += array[k];  // Calculate sum
            }

            System.out.println("=> Sum = " + sum);

            // Update max and min
            if (sum > max) {
                max = sum;
            };
            if (sum < min) {
                min = sum;
            }
        }

        System.out.println();  // For readability
    }

    // Final result
    System.out.println("Maximum Subarray Sum: " + max);
    System.out.println("Minimum Subarray Sum: " + min);
}

public static void main(String[] args) {
    int array[] = {2, 4, 6, 8, 10};
    Print(array);
}
}
