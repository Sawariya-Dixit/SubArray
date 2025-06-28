public class day77 {
    
  
    public static int[][] transpose(int[][] matrix) {
        
                int rows = matrix.length;
                 int cols = matrix[0].length;

               int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;


    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,},{4,5,6},{7,8,9,}};
        int res[][]  =   transpose(arr);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

}
