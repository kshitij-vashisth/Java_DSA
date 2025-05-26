package loops;
import java.util.Scanner;
public class BasicWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 76578;
        while (n!=0) {
            int rem = n %10 ;
        //  task with rem
            System.out.print(rem);
            n /=10;
        }
    }
}
