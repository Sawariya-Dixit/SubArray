import java.util.Arrays;

public class day54 {
   
     public static int[] sub(int arr[], int s){   
         for (int i = 0; i < arr.length -1; i++) {
            int curr = i;
            for (int j = curr; j < arr.length-1; j++) {
                int end  = j;
                 int sum = 0;

                  for (int j2 = curr; j2 <= end; j2++){
                          sum += arr[j2];
                          // System.out.print(arr[j2]+"   ");
                          if ( sum == s){
                            return new int []{curr,end};
                          }
                }
              
            }
          
         }
          return new int[]{-1,-1};

     }
    public static void main(String[] args) {
        int arr [] = { 1,4,20,3,10,5};

        int s = 33;

         int[] res = sub(arr, s);
        System.out.println(Arrays.toString(res));
        

    }
}

