
public class day38 {
    
    public static boolean sum(int arr[], int target){

         int start= 0 ; 
         int end = arr.length-1;

         while (start != end ) {

        if (arr[start] + arr[end]== target) {

         return true;
      }   

      if(arr[start ]+ arr[end] < target)
       {
        start++;
      } 

      
      else{
        end--;
      } 

    }

    return false;
}
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,6};
        int target = 5;

       System.out.println( sum(arr, target));
       
    }
}


