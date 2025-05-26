package loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 123;
        int sum = 0;
        while (n!=0) {
            int rem = n %10 ;
            sum += rem;
//            System.out.print(rem);
            n /=10;
        }
//        System.out.println();
        System.out.println(sum);
    }
}
