public class day51 {
public static boolean solve(int arr[][] , int i , int  j, int path[][] ){
 
       if (i >= arr.length || j >= arr.length || arr[i][j] == 0) return false;
       
      if (i == arr.length-1 && j == arr.length-1)
      {
        path[i][j]= 1;

        printpath(path);
        
        return true;
        
       }
     
      path[i][j] = 1;

       if (solve(arr, i+1, j, path ) || solve(arr, i, j+1, path)) 
       
       {
        return true;

       }
       path[i] [j]= 0;

       return false;
}

public static void printpath(int path[][])

{
    for (int i = 0; i < path.length; i++) 
    {
        for (int j = 0; j < path.length; j++)
        {

            System.out.print(path[i][j]+" ");

        }

        System.out.println();
    }
}
    public static void main(String[] args) {

        int arr[][] =   {{1,0,0,0},
                         {1,1,0,1},
                         {0,1,0,0},
                         {1,1,1,1}};

         int path[][] = new int[arr.length][arr.length];   

         solve(arr, 0 , 0 , path);
              
    }
}

