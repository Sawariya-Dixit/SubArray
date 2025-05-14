public class day32 {
    
    
    
    public static int Optimized(int a , int n){
        if ( n == 0) {
            return 1;
        }

         int halfPower = Optimized(a, n/2);
        int halfPowerSq = halfPower * halfPower;


        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args) {
        int a  = 2;
        int n = 3;
       System.out.println(Optimized(a, n));
    }
}


