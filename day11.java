
public class day11 {


   
    public  static int majorityElement(int[] nums) {
       

       
        int count = 0;
        int candidate =0 ;
           for (int i = 0; i < nums.length; i++) {
            if (count==0) {
                candidate = nums[i];
            }

            if (nums[i]== candidate) {
                count++;
            }
            else{
                count--;
            }

           }
           return candidate;
     }


    public static void main(String[] args) {
        int arr [] = {2,2,1,1,1,2,2};
       System.out.println( majorityElement(arr));
    }

    
  
   
}

