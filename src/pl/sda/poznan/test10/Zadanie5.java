package pl.sda.poznan.test10;

import java.util.Scanner;

/**
 * Napisz program, który pobiera dwie liczby całkowite, a następnie
 * wykonuje następujące operacje matematyczne:
 *
 * dodawanie
 * odejmowanie
 * mnożenie
 * dzielenie
 * podniesienie do potęgi (pierwszy argument to liczba,
 * która będzie podnoszona do potęgi, drugi argument to potęga,
 * do której podnosimy liczbę)
 * Wynik operacji powinien zostać przypisany do nowo utworzonej zmiennej,
 * odpowiedniego typu.
 *
 * Wynik powinien zostać wyświetlony na ekranie, w następującej postaci:
 *
 * dodawanie -> "a = A, b = B, wynik to C"
 * odejmowanie -> "a = A, b = B, wynik to C"
 * mnożenie -> "a = A, b = B, wynik to C"
 * dzielenie -> "a = A, b = B, wynik to C"
 * podniesienie do potęgi -> "a = A, podniesione do potęgi B, daje wynik C"
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę całkowitą");
        int a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą");
        int b = scanner.nextInt();

        System.out.println("a = " + a + ", b = " + b + ", wynik to " + (a + b));
        System.out.println("a = " + a + ", b = " + b + ", wynik to " + (a - b));
        System.out.println("a = " + a + ", b = " + b + ", wynik to " + (1.0 * a * b));
        System.out.println("a = " + a + ", b = " + b + ", wynik to " + (1.0 * a / b));
        System.out.println("a = " + a + " podniesione do potęgi " + b +
                ", daje nam " + Math.pow(a, b));
    }
}
