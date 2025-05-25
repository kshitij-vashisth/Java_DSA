package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want in Fibonacci series:");
        int n = sc.nextInt();
        if (n==1){
            System.out.println(0);
        }
        else if (n==2){
            System.out.println("0 1");
        }
        else if (n > 2) {
            System.out.print("0 1 ");
            int sum = 1;
            int prec = 1;
            for (int i = 2; i < n; i++) {
                System.out.print(sum+" ");
                int temp = sum;
                sum += prec;
                prec = temp;
            }
        }

    }
}
