package pl.sda.poznan.test10;

import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        Integer tablica[] = new Integer[]{ 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(tablica));

        tablica[1] = -10;

        for (int i = 0; i < tablica.length; i++) {
            System.out.printf("tablica[%d]=%d\n", i, tablica[i]);
        }

        for (Integer liczba : tablica) {
            System.out.print(liczba + ", ");
        }
        System.out.println();


        Integer dwaWymiary[][] = new Integer[3][5];
        for (int i = 0; i < dwaWymiary.length; i++) {
            dwaWymiary[i][i] = 0;
            System.out.println(Arrays.toString(dwaWymiary[i]));
        }
    }
}
