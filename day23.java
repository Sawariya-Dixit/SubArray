public class day23 {

    public static int[][] ar(int arr[][]){
        int n = arr.length;
 
        int m = arr[0].length;
 
        int transpose [][] = new int [m][n];
 
        for (int i = 0; i <m; i++){
 
            for (int j = 0; j <n; j++){
 
                transpose[i][j] = arr[j][i];
            }
 
        }
 
        return transpose;
 
     }
 
     public static void main(String[] args)
     {
        int arr[][] = {{1,2,3},{4,5,6}};
    
        int res[][] = ar(arr);
        for (int i = 0; i < res.length; i++)
         {
        for (int j = 0; j < res[0].length; j++)
         {
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
       }
     }
}

 

   

