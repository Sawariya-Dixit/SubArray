public class day33 {
    
    public static int tp(int n){

         if (n==0 || n==1) {
             return 1;
         }
         int vertical = tp(n-1);
         int horizontal = tp(n-2);

         int totalWays = vertical + horizontal;
         return totalWays;
    }
       public static void main(String[] args) {
        int n  = 4;
       System.out.println(  tp(n));
}

}


