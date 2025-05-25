package basic;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        String letter = Character.toString(c);

        String lower_v = "aeiou", upper_v = "AEIOU";
        String lower_c = "bcdfghjklmnpqrstvwxyz";
        String upper_c = "BCDFGHJKLMNPQRSTVWXYZ";
        if (lower_v.contains(letter) || upper_v.contains(letter)) {
            System.out.println("Vowel");
        } else if (lower_c.contains(letter) || upper_c.contains(letter)) {
            System.out.println("Consonant");
        } else {
            System.out.println("Invalid input");
        }

    }
}
