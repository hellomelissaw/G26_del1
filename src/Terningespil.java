import java.util.Scanner;
import Spil.*;

public class Terningespil {

    public static void main(String[] args) {
        // SKABER TO NYE SPILLER OBJEKTER, EN RAFFELBÆRER OG EN SCANNER OBJEKT
        Spiller spiller1 = new Spiller();
        Spiller spiller2 = new Spiller();
        Raffle raffel1 = new Raffle();
        Scanner trykEnter = new Scanner(System.in);

        // INITIALISERER VAR TIL SUM AF TERNINGER OG POINT TIL SPILLERE
        int sumTerninger;
        int pointSpiller1 = 0;
        int pointSpiller2 = 0;
        int maksPoint = 40;

        System.out.println("Velkommen til Terningespillet.");
        /* FOR LOOP TIL DEBUGGING
        for(int i = 1 ; i < 5 ; i++) {
            sumTerninger = raffel1.getSum();
            //raffel1.printSum();
            System.out.println("Summen er: " + sumTerninger);
        } */

        while (pointSpiller1 < maksPoint && pointSpiller2 < maksPoint) {
            System.out.println("\nSpiller 1, det er din tur. Tryk 'enter' til at kaste terninger.");
            trykEnter.nextLine();
            sumTerninger = raffel1.getSum();
            pointSpiller1 = spiller1.setPoint(sumTerninger);
            System.out.println("Du har nu " + spiller1.getTotalPoint() + " point.");

            if (pointSpiller1 < maksPoint) {
                System.out.println("\nSpiller 2, det er din tur. Tryk 'enter' til at kaste terninger.");
                trykEnter.nextLine();
                sumTerninger = raffel1.getSum();
                pointSpiller2 = spiller2.setPoint(sumTerninger);
                System.out.println("Du har nu " + spiller2.getTotalPoint() + " point.");
            }

            if (pointSpiller1 >= maksPoint) {
                System.out.println("Spiller 1, du har vundet!");
            } else if (pointSpiller2 >= maksPoint) {
                System.out.println("Spiller 2, du har vundet!");
            }
        }









       /* // INITIALISERER OBJEKTER OG VARIABLER
        Terning terning1, terning2;
        SumTerninger sumSpiller1, sumSpiller2;
        String spiller1, spiller2;
        //int resultat;
        int resultatSpiller1, resultatSpiller2;
        int t1, t2;

        final int maksPoints = 40; // ANGIVER ANTALLET AF POINTS FØR EN SPILLER VINDER

        // SKABER NYE OBJEKTER
        terning1 = new Terning();
        terning2 = new Terning();

        sumSpiller1 = new SumTerninger();
        sumSpiller2 = new SumTerninger();

        Scanner scan = new Scanner(System.in);

        //SPILLET STARTER HER!
        System.out.println("Kære spiller 1, indtast venligst Deres navn og tryk 'enter'.");
        spiller1 = scan.nextLine();

        System.out.println("Kære spiller 2, indtast venligst Deres navn og tryk 'enter'.");
        spiller2 = scan.nextLine();

        System.out.println("\n" + "Tryk 'enter' til at kaste terningerne, når det er din tur.");

        resultatSpiller1 = 0; resultatSpiller2 = 0; // SÆTTER STARTANTALLET AF POINTS

        while(resultatSpiller1 < maksPoints && resultatSpiller2 < maksPoints) {

           // SPILLER 1 KASTER TERNINGER
                System.out.println("\n" + spiller1 + ", det er Deres tur.");
                scan.nextLine();

                // GENERERER TILFÆLDIGE TAL OG GEMME VÆRDIEN I VARIABLERNE
                t1 = terning1.kast();
                t2 = terning2.kast();

                System.out.println("Første terning: " + terning1 + " og anden terning: " + terning2);

                resultatSpiller1 += sumSpiller1.hentSum(t1, t2); // LÆGGER VÆRDI AF TERNINGER SAMMEN OG TILFØJER POINTS TIL SPILLEREN

                System.out.println(spiller1 + ", De har nu " + resultatSpiller1 + " points.");

                // Hvis spilleren 1 opnår 40 point
                if (resultatSpiller1 >= maksPoints){
                System.out.println(spiller1 + ", du har opnået maks point. nu skal du slå to ens for at vinde spillet!");

            }


            if(resultatSpiller1 < maksPoints){ // SPILLER 2 KASTER TERNINGER SÅ LÆNGE SPILLER 1 IKKE HAR VUNDET
                System.out.println("\n" + spiller2 + ", det er Deres tur.");
                scan.nextLine();

                // GENERERER TILFÆLDIGE TAL OG GEMME VÆRDIEN I VARIABLERNE
                t1 = terning1.kast();
                t2 = terning2.kast();

                System.out.println("Første terning: " + terning1 + " og anden terning: " + terning2);

                resultatSpiller2 += sumSpiller2.hentSum(t1, t2); // LÆGGER VÆRDI AF TERNINGER SAMMEN OG TILFØJER POINTS TIL SPILLEREN

                System.out.println(spiller2 + ", De har nu " + resultatSpiller2 + " points.");
            }
            if (resultatSpiller2 >= maksPoints){
                System.out.println(spiller2 + ", du har opnået maks point. nu skal du slå to ens for at vinde spillet!");

            }
        } */
    }
}