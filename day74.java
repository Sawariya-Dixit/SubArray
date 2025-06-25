public class day74 {
    
   
    public static void rotate(int[][] matrix) {

        int n = matrix.length;
    
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

       
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
              
                int temp = matrix[i][left];  
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
              
                left++;
                right--;
            }
        }


         for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
 
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(mat);
    
    }
} 

