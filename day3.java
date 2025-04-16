public class day3 {

    public static int  sell(int arr[]){
 
         
         int buyStock = Integer.MAX_VALUE;
         int  max = 0;

         for (int i = 0; i < arr.length; i++) {
             if (buyStock < arr[i]) {
                
                 int profit  = arr[i]- buyStock;
                   
                  // if (max<profit) {
                  //    max = profit;
                  // }
                  max = Math.max(max, profit);
                  
                   
             }

             else
             {
                buyStock = arr[i];
             }
           

         }
        return max;
    }
  public static void main(String[] args) {
    int arr [] = {7, 1 , 5,  3, 6, 4};
        
   System.out.println("Profit is : " +sell(arr));
  }  
}
