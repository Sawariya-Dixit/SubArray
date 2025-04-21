public class day9 {
    

    public  static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i = 0; i < prices.length - 1; i++) {
            if(prices[i] < prices[i + 1]) {
                maxProfit += prices[i + 1] - prices[i]; // Buy today, sell tomorrow
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
       int arr[] = {7,1,5,3,6,4};
      System.out.println( maxProfit(arr)); 
    }
}


