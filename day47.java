public class day47 {
    
public static boolean isSafe(char board[][] ,int row , int col){
    // !vertical up 
    for (int i = row-1; i >=0; i--) {
        if (board[i][col] == 'Q') {
            return false;
        }

    }

    // ! daignal left up 

     for (int i = row-1 , j = col-1; i >=0 && j>=0; i--,j--) {
        if (board[i][j] == 'Q') {
            return false;
        }

    }

     //! daignal right up */
     for (int i = row-1 , j = col+1; i >=0 && j<board.length; i--,j++) {
        if (board[i][j] == 'Q') {
            return false;
        }
    }

    return true;

}
    public static void nQeens(char board [][], int row){

         if (row == board.length) {
             printBoard(board);
            
            count++;
            return;

         }


         for(int j = 0; j<board.length; j++)
         {
         if( isSafe(board , row , j))
         {
              board[row][j] = 'Q';
              nQeens(board, row+1);
              board[row][j] = 'x';
          }

         }

    }

    public static void printBoard( char board [][]){
        System.out.println("---------chess -----------");
        for (int i = 0; i < board.length; i++) {
           for (int j = 0; j < board.length; j++) 
            {
            System.out.print(board[i][j]+" ");
           } 
           System.out.println();

        }

    }

    static int count = 0;

    public static void main(String[] args){

        int  n = 5;
        char [][] board = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) 
            {
             board[i][j] = 'x';
            }
        }
        
        nQeens(board,0);
        System.err.println(count);
    }
}


