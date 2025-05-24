import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a1 = 'a';
        char a2 = 'a';
        System.out.println(a1++); // no mathematical operations and is post oprator, output should be a
        System.out.println(a2++ + a2); // mathematical operation after incremental post operator
                                        // a becomes b, then w are left with a + b, convert to int and add,
                                        // output should be 195
    }
}
