package loops;
import java.util.Scanner;
public class TwoDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7856875;
        while ( n > 9) {
            int sum = 0;
            while (n!= 0) {
                int lastDigit = n % 10;
                sum += lastDigit;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n);
    }
}
