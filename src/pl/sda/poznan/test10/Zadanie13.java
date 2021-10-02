package pl.sda.poznan.test10;

import java.util.Random;

/**
 * Napisz program, który stworzy tablicę dla 10 elementów typu integer.
 * Program powinien wypełnić tablicę losowymi liczbami z zakresu od [-10..10],
 * a następnie:
 * <p>
 * wydrukuje zawartość tablicy na ekran
 * wydrukuje najmniejszą (minimalną) wartość z tablicy
 * wydrukuje największą (maksymalną) wartość z tablicy
 * <p>
 * przykład
 * Wartość z tablicy: 0
 * Wartość z tablicy: 0
 * Wartość z tablicy: 2
 * Wartość z tablicy: 1
 * Wartość z tablicy: 5
 * Wartość z tablicy: 2
 * Wartość z tablicy: 0
 * Wartość z tablicy: 4
 * Wartość z tablicy: 6
 * Wartość z tablicy: 4
 * Maksimum wynosi: 6
 * Minimum wynosi: 0
 */
public class Zadanie13 {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(20) - 10;


    }

}
