public class day4 {
     

     public static int water(int height[]){

           int n = height.length;


         //*Two pointer approach  */



        //  ! left vali badi boundry //

         int leftMax[] = new int [n];
         leftMax[0] = height[0];
         for (int i = 1; i < height.length; i++) {
         leftMax[i] = Math.max(height[i], leftMax[i-1]);


         }
         

            //! right vali boundry //

          int  rightMax [] = new int[n];
          rightMax[n-1] =  height[n-1];
          for (int i = n-2; i >= 0; i--) {
          rightMax[i] = Math.max(height[i], rightMax[i+1]);
          }




          //* Trapwater nikalne ka formula  */
          int trapwater = 0;

         for (int i = 0; i < n; i++) {
             int waterLevel = Math.min(leftMax[i],rightMax[i]);
             trapwater += waterLevel  - height[i];
         }    
        
         return trapwater;

     }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
       System.out.println( water(height));

    }
}
