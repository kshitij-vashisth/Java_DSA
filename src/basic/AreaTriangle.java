package basic;
import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of the triangle:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = (a+b+c)/2;
        double areaSQ = (s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+Math.sqrt(areaSQ)+" sq units.");
    }
}
