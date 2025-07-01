public class day80 {
    
  
    public static int[] plusOne(int[] digits) {
        int carry = 1;  
    
    for (int i = digits.length - 1; i >= 0; i--) {
        digits[i] = digits[i] + carry;
        if (digits[i] == 10) {
            digits[i] = 0;
            carry = 1;  
        } else {
            carry = 0;  
            break;     
        }
    }
    
    if (carry == 1) {
       
        int[] result = new int[digits.length + 1];
        result[0] = 1;
       
        return result;
    }
    
    return digits;
    }

public static void main(String[] args) {
    int arr[] =  {1,2,3,};
   int res[]  =   plusOne(arr);

   for (int i = 0; i < res.length; i++) {
    System.out.print(res[i]+" ");
   }

 }
 
}
