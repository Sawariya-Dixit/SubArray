import java.util.Scanner;

public class day69 {
   

    public static double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1.0;
        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        double result = myPow(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
}




