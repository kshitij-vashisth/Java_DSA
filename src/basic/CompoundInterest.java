package basic;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal=1000, time=3, rate=5;
        double amount = principal * (Math.pow((1 + (rate/100)), time));
        double CI = amount - principal;
        System.out.println(CI);
    }
}
