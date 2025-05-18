public class day36 {
    
     public static int maxArea(int[] height) {
         int maxWater = 0 ; 
         int start  = 0 ;
         int end  = height.length-1;

         while(start < end){
            int ht = Math.min(height[start], height[end]);
                int widht = end - start;
                int currWater = ht * widht;
                maxWater = Math.max(maxWater,currWater);

                if(height[start] < height[end] ){
                    start++;
                }
                else{
                    end--;
                }
            }
               return maxWater;
         }

         public static void main(String[] args) {
            int arr[] = {1,8,6,2,5,4,8,3,7,};
            System.out.println(maxArea(arr));
         }
}
