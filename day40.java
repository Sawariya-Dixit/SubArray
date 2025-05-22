public class day40 {
 
     public static int missingNum(int arr[]) {
        
        long n = arr.length+1;
        long ArraySum = 0;
        for(int  i = 0; i<arr.length; i++){
            
            ArraySum += arr[i]; 
        }
        
        long TotalSum = (n * (n+1))/2;
        long missing = TotalSum - ArraySum;
        
        return (int)missing;
    }
    public static void main(String[] args) {
        int arr[] =  {1,2,3,5};
        System.out.println(missingNum(arr)); 
    }
}
