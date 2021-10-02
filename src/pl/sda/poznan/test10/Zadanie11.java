package pl.sda.poznan.test10;

import java.util.Scanner;

/**
 * Napisz program, który pobiera hasło od użytkownika.
 * Program powinien zapytać użytkownika o wprowadzenie poprawnego hasła.
 * W przypadku gdy wprowadzone hasło będzie poprawne, program powinien
 * wydrukować na ekranie tekst "Poprawne hasło", w przeciwnym wypadku,
 * wprowadzone hasło powinno zostać wyświetlone na ekranie, a użytkownik
 * powinien mieć możliwość ponownie wprowadzić hasło.
 */
public class Zadanie11 {

    public static final String SECRET = "secret";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        do {
            System.out.println("Podaj hasło");
            password = scanner.nextLine();
            System.out.println(SECRET.equals(password) ? "Poprawne hasło" : password + "\nNiepoprawne hasło");
        } while (!SECRET.equals(password));

    }
}
