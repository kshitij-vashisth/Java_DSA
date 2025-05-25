package basic;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 5; i <= 10; i = i + 2) {
//            System.out.println("hello");
            System.out.println(i);
        }
        System.out.printf("after loop : %d\n", i);
        for (i = 5; i >= 1; i--) {
//            System.out.println("hello");
            System.out.println(i);
        }
        System.out.printf("after loop : %d\n", i);
        i = 5;
        for (; i <= 10; i++) ;
        {
            System.out.println("hello " + i);
        }
        for (i = 100; i>0; i = i/10){
            System.out.println(i);
        }
    }
}
