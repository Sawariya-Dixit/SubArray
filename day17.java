public class day17 {
  
        public static int p (int arr[]){
    
    
             int s = 0;
             int e = arr.length-1;
             while (s<e) {
                int mid = (s+e)/2;
               
                 if (arr[mid]> arr[e]){
                    s = mid +1;
                }
                else{
                    e = mid;
                }
             }
           return arr[s];
             
        }
      public static void main(String[] args) {
        int arr []= {3,4,5,7,1,2};
        int res =  p(arr);
        System.out.println("found minimum value In array\t"+res);
      }  
    }
    

