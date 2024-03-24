import java.util.Scanner;
public class gcd {
    public static int gcd_finder(int a, int b) {
        // base case
        if (b == 0) { // if b reaches 0, return the gcd
            return a;
        }
        // recursive case
        return gcd_finder(b, a%b); // recursively call to find GCD of both integers with modulo operation
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        Scanner ex = new Scanner(System.in);
        System.out.print("Input second number: ");
        int b = ex.nextInt();
        int gcd_result = gcd_finder(a,b);
        System.out.print("GCD of " + a + " and " + b + " is " + gcd_result );
    }
}
