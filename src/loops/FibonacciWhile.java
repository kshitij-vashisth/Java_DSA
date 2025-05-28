package loops;

public class FibonacciWhile {
    public static void main(String[] args) {
        int n = 9;
        System.out.print(0+" "+1+" ");
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int i = 2;
        while (i <9){
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
            i++;
        }
    }
}
