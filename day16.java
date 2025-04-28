public class day16 {
    public static void subArrat(int arr[]){

        int currsum = 0 ;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int [arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
          
           prefix[i] = prefix[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
          
           int start = i ;

           for (int j = i; j < arr.length; j++) {
              int end = j ;
               currsum = start == 0 ? prefix[end]:  prefix[end] - prefix[start-1];


                    if (max < currsum) {
                       max = currsum;
                    }
              
           }
        }
        System.out.println(max);

  }


   public static void main(String[] args) {
      int arr[]= {1,-2,6,-1,3};
       subArrat(arr);
   }
}
