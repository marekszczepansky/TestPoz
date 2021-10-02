package pl.sda.poznan.test10;

/**
 * Napisz program, który wydrukuje na ekran następujący tekst
 * "To jest komunikat w pętli X", pięć razy. Gdzie X to numer
 * wyświetlonego komunikatu.
 */
public class Zadanie9 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("To jest komunikat w pętli " + i);
        }
    }
}
