package pl.sda.poznan.test10;

import java.util.Scanner;

/**
 * Napisz program, który pobiera imie od użytkownika, najpierw jednak
 * wypisze na ekran słowa "Podaj swoje imie". Imię powinno zostać wydrukowane
 * na ekran. Jeśli podane imię zgadza się z "John Wick", to na ekran program
 * powinien wypisać "Widzę, że znów pracujesz John", w przeciwnym przypadku
 * program powinien wydrukować na ekran "Witaj, [xyz]", gdzie [xyz],
 * powinno zostać zastąpione wartością podaną przez użytkownika.
 */
public class Zadanie7 {

    public static final String JOHN_WICK = "John Wick";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imie");
        String name = scanner.nextLine();
        System.out.printf("Twoje imię to %s\n", name);
        if (JOHN_WICK.equals(name)) {
            System.out.println("Widzę, że znów pracujesz John");
        } else {
            System.out.println("Witaj, " + name);
        }

    }
}
