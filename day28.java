public class day28 {
   public static void oddEven(int n){

     int bitmask = 1;
     if ((n & bitmask)==0) {
        System.out.println("Even number");
     }
     else{
        System.out.println("Odd number");
     }
   }
    public static void main(String[] args) {
        oddEven(4);
    }
}
