public class day75 {
    


    public  static int maximumWealth(int[][] accounts) {
        
           int max = Integer.MIN_VALUE;

         for (int i = 0; i < accounts.length; i++) {
            int cs = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                cs += accounts[i][j];
            }

            max = Math.max(max, cs); 
        }

        return max;
    }

     public static void main(String[] args) {
        int arr[][]  =  {{1,2,3},{3,2,1}};
        System.out.println( maximumWealth(arr));
     }
 }



