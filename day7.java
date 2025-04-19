public class day7 {
    
  
      

        public static void reverse(int n []){
           int start = 0, end = n.length-1;
   
           while (start < end) {
                int temp = n[end];
                n[end] = n[start];
                n[start] = temp; 
   
                 start++;
                 end--;
           }
   
        }
   
       public static void main(String[] args) {
           int arr [] = {2,4,6,8,10};
            reverse(arr);
   
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]+" ");
            }
       }
   }
   

