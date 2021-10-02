package pl.sda.poznan.test10;

import java.util.Scanner;

/**
 * Zmodyfikuj kod z {@link Zadanie9}, w taki sposób, aby użytkownik
 * samodzielnie podawał ilość wyświetlonych komunikatów.
 */
public class Zadanie10 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Ile komunikatów wyświetlić");
        final int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("To jest komunikat w pętli " + i);
        }

    }
}
