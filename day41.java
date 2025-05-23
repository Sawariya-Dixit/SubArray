public class day41 {
    
    public static void allOccuranece(int arr[] , int key , int i){
 
         if (i == arr.length ) {
            return; 
         }
         if (arr[i] == key) {
            
             System.out.println(i+" ");
         }
         allOccuranece(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,5,6,2,7,2};
        int key  = 2;
       allOccuranece(arr, key, 0);

    }
}



