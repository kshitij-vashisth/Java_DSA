package basic;
import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("M/F?");
        char choice = sc.next().charAt(0);
        if (choice == 'M') {
            System.out.printf("Good Morning sir");
            return;
        }
        // We can have an else statement here, but we don't need it
        System.out.printf("Good Morning ma'am");
        return;
    }
}
