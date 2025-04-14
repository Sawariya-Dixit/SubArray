public class day2 {
    

    public static void kadan(int arr[]){

        
        int ms = Integer.MIN_VALUE;
        int cs = 0; 
        boolean flag = false;


         for (int i = 0; i < arr.length; i++) {
            
            cs = cs + arr[i];


            if (arr[i]>0) {
                flag = true;
            }


          
            if (cs < 0) {
                cs = 0;
            }  
             ms = Math.max(cs, ms);

           
         }

         if (!flag) {
            System.out.println("-1");
         }
         else{
            System.out.println("maximum subArray sum is "+ms);
         }

         //System.out.println("maximum subArray sum is"+ms);

         
    }
    public static void main(String[] args) {
        int arr[] = {-3,-2,-4,2,-1};

         kadan (arr);


    }


}




   