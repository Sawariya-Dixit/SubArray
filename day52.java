public class day52 {

    static String digits[]= {"zero", "one", "two" , "three ", "four", "five" , "six", "seven" , "eight" , "nine" };

    public static void printDigits(int numbers ){
        if (numbers ==0 ) {
            return;
        }


         int lastDigit = numbers%10;
         printDigits(numbers/ 10);

         System.out.print(digits[lastDigit]+"   ");

    }
 
    public static void main(String[] args) {
        printDigits(1947);

    }
}
