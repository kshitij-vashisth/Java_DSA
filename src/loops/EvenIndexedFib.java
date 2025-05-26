package loops;

import java.util.Scanner;

public class EvenIndexedFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        int sum = 1;   // F(1)
        int prec = 0;  // F(0)

        for (int i = 2; i <= 2 * n; i++) {
            int temp = sum;
            sum += prec;
            prec = temp;

            if (i % 2 == 0) {
                total += sum;
            }
        }

        System.out.println(total);
    }
}
