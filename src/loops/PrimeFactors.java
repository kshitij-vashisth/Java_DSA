package loops;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        for (int j = 2; j<= n; j++) {
            int c = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    c++;
                }
            }
            if (c==2) {
                while (temp % j ==0) {
                    System.out.println(j);
                    temp/=j;
                }

            }
        }
    }
}
