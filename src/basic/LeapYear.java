package basic;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        if (year % 400 == 0) {
            System.out.printf("%d is a leap year and a century year as well", year);
        } else if (year % 400 != 0 && year % 100 == 0) {
            System.out.printf("%d is a century year but not a leap year", year);
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.printf("%d is a  leap year but not a century year", year);
        } else {
            System.out.printf("%d is neither a leap year nor a century year",year);
        }
    }
}
