package pl.sda.poznan.test10;

import java.util.Scanner;

/**
 * Napisz program, który dokona konwersji temperatury wprowadzonej przez użytkownika:
 *
 * ze skali Celsjusza na skalę Fahrenheit'a (stopnie w F = 1.8 * stopnie w C + 32)
 * ze skali Fahrenheit'a na skalę Celsjusza (stopnie w C = (stopnie w F - 32 / 1.8))
 * ze skali Celsjusza na skalę Kelvin'a (stopnie w K = stopnie w C + 273.15)
 * ze skali Kelvin'a na skalę Celsjusza (stopnie w C = stopnie w K - 273.15)
 * ze skali Kelvin'a na skalę Fahrenheit'a (stopnie w F = (stopnie w K - 273.15) * 1.8 + 32)
 * ze skali Fahrenheit'a na skalę Kelvin'a (stopnie w K = ((stopnie w F - 32/1.8) + 273.15)
 * Każdą z operacji konwersji temperatury, napisz w osobnej metodzie,
 * którą następnie wywołasz w metodzie main.
 */
public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperaturę");
        float temp = scanner.nextFloat();

        System.out.printf("C do F %.2f\n", temp * 1.8 + 32);
        System.out.printf("F do C %.2f\n", (temp - 32) / 1.8);
        System.out.printf("C do K %.2f\n", temp + 273.15);
        System.out.printf("K do C %.2f\n", temp - 273.15);
        System.out.printf("K do F %.2f\n", (temp - 273.15) * 1.8 + 32);
        System.out.printf("F do K %.2f\n", (temp - 32) / 1.8 + 273.15);
    }
}
