import java.util.Scanner;
public class HasNextMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = sc.nextInt();
            System.out.println("Data = "+a);
        }
        else {
            System.out.println("Please enter integer");
        }

    }
}
