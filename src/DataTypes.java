public class DataTypes {
    public static void main(String[] args) {
        byte b = 12; // can store 12 but not 128 because that would be out of range
        long d = 2147483648L; // long values require suffix capital L,
                              // small can be used but not in convention
        long e = 2147483648l;
        System.out.println(e);
        // byte 8 bits
        // char 16 bits
        // float 32 bits
        //double 64 bits
        // every integer constant/literal in java is int by default
        // maximum ranges:
        // byte: 127
        // short: 32767
        // int: 2147483647
        // every floating constant in java is double by default
        // float suffix:f or F, double suffix is optional: d or D
        double a = 0.6d;
        double a1 = 0.2D;
        double a2 = 0.3;
        double a4 = 0.1;
        System.out.println(a+a1+a2+a4); // output comes out as 1.2000000000000002,
                                        // which checks out my theory that order doesnt
                                        // change claculations
        System.out.println(a+a1+a2); // output comes out as 1.1 which is correct
        float f = 0.3f;
        double a3 = 0.3;
        System.out.println(a+a1+a2+f); // output is 1.400000011920929, weird
        System.out.println(a+a1+a2+a3); // output is 1.4000000000000001, weird
        System.out.println(a+a1+a2+a4); // output comes out as 1.2000000000000002, weird
        // booleans only take true/false, not 0/1  like c, c++
        // American Standard Code for Information Interchange (ASCII)- max 255 chars
        // Java supports UNICODE, 65,535 chars

        // chars can have characters in single quote or their value
        char ch = 'a';
        char ch1 = 97;
        System.out.println(ch+" is same as "+ch1); // output: a is same as a
        for (char i = 0; i < 65535; i++) {
            System.out.print(i);
            if (i%80==0) System.out.println(); // new line char after 80 chars
        }
    }
}
