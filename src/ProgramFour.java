import java.util.Scanner;
public class ProgramFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:"); // avoided using nextline because it takes new line also
        String name = sc.next();
        System.out.println("Enter Age:");
        byte age = sc.nextByte();
        System.out.println("Hello "+name+", you are "+age+" years old.");
        //please note, if you are using nextline, then if there is any scanner before it,
        // best practice is to use a dummy nextline before using it
    }
}
