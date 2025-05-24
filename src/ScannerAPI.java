import java.util.Scanner;
public class ScannerAPI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int a = sc.nextInt();
//        System.out.println("Enter one more number");
//        int a1 = sc.nextInt();
//
//        System.out.println("Sum equals "+(a+a1));

        // lets do char and string
        System.out.println("Enter something");
        String token = sc.nextLine();
        System.out.println("Data = "+token);
        String token1 = sc.next();
        System.out.println("Data = "+token1);
    }
}
