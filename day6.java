public class day6 {
    
     
        public static void printArray(int arr []){
      

             // Pair Of SubArray //
            
           for (int i = 0; i < arr.length; i++) {
                  int currnet = arr[i];
                  for (int j = i+1; j   < arr.length; j++) {
                             System.out.print("("+currnet+","+arr[j]+")");
                  }
                  System.out.println();
           }
        }
   
        public static void main(String[] args) {
            
   
            int arr [] = {2,4,6,8,10};
   
            printArray(arr);
        }
   }
   

