package pl.sda.poznan.test10;

import java.util.Scanner;

/**
 * Napisz program, który pobierze od użytkownika liczbę całkowitą i wypisze ją
 * na ekran. Na ekranie powinien wyświetlać się następujący komunikat
 * "Użytkownik wprowadził X", gdzie X jest liczbą podaną przez użytkownika.
 * Zakładamy sytuację, w której użytkownik, nie będzie wprowadzał innych t
 * ypów danych niż liczby całkowite.
 *
 * Do obsługi wprowadzania danych przez użytkownika zastosuj bibliotekę Scanner.
 * Wykonaj testy, sprawdź jak program, zachowuje się dla innych typów danych.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int x = scanner.nextInt();
        System.out.println("Użytkownik wprowadził " + x);
    }
}
