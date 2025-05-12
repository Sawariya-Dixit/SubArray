public class day30 {
    
 
    
    public static int lastOccurance(int arr[], int key, int i  ){

         if (i == arr.length-1) {
            return -1;
         }
         int isFound = lastOccurance(arr, key, i+1);
         if (isFound == -1 && arr[i]==key) {
            return i;
         }
         return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,7,5,8};
       int key = 5 ;
      System.out.println( lastOccurance(arr, key, 0));
    }
}


