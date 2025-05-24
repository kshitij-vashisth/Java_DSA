import java.util.Scanner;
public class ReadChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Gender (m/f):");
        char gender = sc.next().charAt(0);
        System.out.println("Hello, you are a "+gender+".");
    }
}
