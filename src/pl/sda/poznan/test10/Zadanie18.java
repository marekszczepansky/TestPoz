package pl.sda.poznan.test10;

/**
 * Poniższy program, drukuję liste uczestników kursu w Software Development
 * Academy, w grupie TestInt256. Na liście jest 15 kursantów, niestety
 * program drukuje tylko 11 osób z listy. Popraw program, aby lista uczestników
 * była wyświetlona w sposób poprawny.
 */
public class Zadanie18 {
    public static void main(String[] args) {
        String[] participantList = new String[15];
        participantList[0] = "Louto Kennedy";
        participantList[1] = "Blake Baker";
        participantList[2] = "Jacob Campbell";
        participantList[3] = "Arthur Green";
        participantList[4] = "Caleb Willis";
        participantList[5] = "Heath Rasmussen";
        participantList[6] = "Lara Malinowska";
        participantList[7] = "Kase Knapp";
        participantList[8] = "Avery Livingston";
        participantList[9] = "Armando Zamora";
        participantList[10] = "Skye Hunt";
        participantList[11] = "Gale Carr";
        participantList[12] = "Gabe Collins";
        participantList[13] = "Mel Pruitt";
        participantList[14] = "Jess Owen";

        for (int i = 0; participantList.length > i; i++ ) {
            System.out.println("Uczestnik nr " + i + " to " + participantList[i]);
        }
    }

}
