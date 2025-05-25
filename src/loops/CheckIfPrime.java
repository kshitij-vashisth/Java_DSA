package loops;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers you want to check is prime or not:");
        int n = sc.nextInt();
        for (int j = 1; j<= n; j++) {
            int c = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    c++;
                }
            }
//            System.out.println(c == 2 ? "Prime" : "Not Prime");
            if (c==2) {
                System.out.println(j);
            }
        }

    }
}
