public class day67 {

     public  static int findMin(int[] nums){
        
        int start = 0;
        int end = nums.length-1;
        
        while(start < end){
            int mid = (start + end)/2;


           if (nums[mid] > nums[end]) 
            {
                start = mid + 1;

            } 
          
            else 
            {
                end--;
            }

        }

        return nums[start];

    }

    public static void main(String[] args) {
        int arr[]   =  {1,3,5};
 
        System.out.println(findMin(arr));
    }
    
}