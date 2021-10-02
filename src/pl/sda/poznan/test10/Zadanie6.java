package pl.sda.poznan.test10;

import java.util.Scanner;

/**
 * Napisz program, który pobiera hasło od użytkownika, najpierw jednak
 * wypisze na ekran słowa "Poproszę hasło". Pobrane hasło powinno zostać
 * wypisane na ekran. Jeśli hasło zgadza się z hasłem wzorcowym "secret",
 * to na ekran powinien zostać wypisany tekst "Witaj w tajnym miejscu",
 * w przeciwnym przypadku zakończ działanie programu.
 */
public class Zadanie6 {

    public static final String CORRECT_PASSWORD = "secret";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Poproszę hasło");
        String password = scanner.nextLine();
        System.out.printf("Podane hasło to %s\n", password);
        if (CORRECT_PASSWORD.equals(password)) {
            System.out.println("Witaj w tajnym miejscu");
        }
    }
}
