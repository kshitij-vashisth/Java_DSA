package loops;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to calculate factorial for:");
        int n = sc.nextInt();
        int factorial = n;
        for (; n > 1; n--) {
            factorial *= n-1;
        }
        System.out.println(factorial);

        // using big integer
        System.out.println("Enter number to calculate factorial for (big integer):");
        int o = sc.nextInt();
        BigInteger fact = new BigInteger("1");
        for (int i =1; i <= o; i++) {
            fact = fact.multiply(new BigInteger(Integer.toString(i)));
        }
        System.out.println(fact);
    }
}
