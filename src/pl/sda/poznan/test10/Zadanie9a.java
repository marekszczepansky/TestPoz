package pl.sda.poznan.test10;

/**
 * Napisz program, który wydrukuje na ekran następujący tekst
 * "To jest komunikat w pętli X", pięć razy. Gdzie X to numer
 * wyświetlonego komunikatu liczony od 5 do 1.
 */
public class Zadanie9a {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("To jest komunikat w pętli " + i);
        }
    }
}
