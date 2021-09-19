package pl.sda.poznan.test10;


import java.util.Scanner;

@SuppressWarnings("ALL")
public class HelloWorld {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("\nHello world!");

        int x, y;
        boolean a = true, b = false;

        System.out.println("Podaj wartość x ");
        x = myScanner.nextInt();
        System.out.println("Podaj wartość y ");
        y = myScanner.nextInt();


        System.out.println(!(a && b) + " = " + (!a || !b));
        System.out.println(!(a || b) + " = " + (!a && !b) );

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println();
        System.out.println("x     = "  + displayBinary(x));
        System.out.println("y     = "  + displayBinary(y));
        System.out.println("x & y = "  + displayBinary(x&y));
        System.out.println();
        System.out.println("x     = "  + displayBinary(x));
        System.out.println("y     = "  + displayBinary(y));
        System.out.println("x | y = "  + displayBinary(x|y));
        System.out.println();
        System.out.println("x     = "  + displayBinary(x));
        System.out.println("y     = "  + displayBinary(y));
        System.out.println("-1    = "  + displayBinary(-1));
        System.out.println("x ^ y = "  + displayBinary(x^y));
        System.out.println("x ^ -1= "  + displayBinary(x^-1));
        System.out.println();
        System.out.println("~x = " + ~x);
        System.out.println("~y = " + ~y);
        System.out.println("~x    = "  + displayBinary(~x));
        System.out.println("~y    = "  + displayBinary(~y));

    }

    private static String displayBinary(int x) {
        return String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0");
    }
}
