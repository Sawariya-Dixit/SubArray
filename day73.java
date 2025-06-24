public class day73 {

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int count = 1;

        while (top <= bottom && left <= right) {
            // ➡ Left to Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = count++;
            }
            top++;

            // ⬇ Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = count++;
            }
            right--;

            // ⬅ Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = count++;
                }
                bottom--;
            }

            // ⬆ Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = count++;
                }
                left++;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
        int n = 3; 
        
        int[][] result = generateMatrix(n);


        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}


