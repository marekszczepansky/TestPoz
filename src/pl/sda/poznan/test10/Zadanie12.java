package pl.sda.poznan.test10;

import java.util.Scanner;

/**
 * Napisz program, który pobierze od użytkownika, dodatnią liczbę
 * całkowitą, a następnie wypisze wszystkie liczby nieparzyste,
 * nie większe od tej liczby.
 */
public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę:");
        final int number = scanner.nextInt();

        for (int i = 1; i <= number ; i+=2) {
            System.out.println("liczba nieparzysta: " + i);
        }

    }
}
