import java.util.Scanner;
import Spil.*;

public class Terningespil {

    public static void main(String[] args) {

        // INITIALISERER OBJEKTER OG VARIABLER
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
        }
    }
}