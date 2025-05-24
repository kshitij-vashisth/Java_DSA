package basic;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the length of the rectangle:");
        double length = sc.nextDouble();
        System.out.println("Please enter the breadth of the rectangle:");
        double breadth = sc.nextDouble();

        System.out.println("Area of the rectangle is "+(length*breadth)+" sq units.");
        System.out.println("Perimeter of the rectangle is "+(2*(length+breadth))+" units.");
    }
}
