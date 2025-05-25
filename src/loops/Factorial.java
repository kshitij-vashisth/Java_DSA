package loops;
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
    }
}
