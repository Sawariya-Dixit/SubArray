public class day13 {
    
    
    public static boolean search(int arr[][] , int key ){
 
        int row = arr.length-1, col = 0;

        while ( col < arr.length && row>=0) 
        {
           if (arr[row][col]==key)
            {
               System.out.println("found key at : "+"("+row+","+col+")");
               return true;
           }
            else if (key >arr[row][col]) {
               col++;
            }
            else{
              row--;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
       int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       int key = 11;
       search(arr ,key);
    }
}
