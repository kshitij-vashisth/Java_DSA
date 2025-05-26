package loops;

public class AutoMorphicNumber {
    public static void main(String[] args) {
        int n = 7;
        int temp = n;
        int c = 0;
        while (n != 0) {
            c++;
            n = n / 10;
        }
        n = temp;
        long sq = n * n;
        long lastDigits = sq % (long) Math.pow(10,c);
        System.out.println(lastDigits==n?"Auto": "Not Auto");

    }
}
