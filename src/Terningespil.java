import java.util.Scanner;
import Spil.*;

public class Terningespil {

    public static void main(String[] args) {

        // INITIALISERER OBJEKTER OG VARIABLER
        Terning terning1, terning2;
        SumTerninger sumSpiller1, sumSpiller2;
        String spiller1, spiller2;

        int resultatSpiller1, resultatSpiller2;
        Raffle rafflebær = new Raffle();

        final int maksPoints = 40; // ANGIVER ANTALLET AF POINTS FØR EN SPILLER VINDER

        // SKABER NYE OBJEKTER
        terning1 = new Terning();
        terning2 = new Terning();

        sumSpiller1 = new SumTerninger();
        sumSpiller2 = new SumTerninger();

        Scanner scan = new Scanner(System.in);

        //SPILLET STARTER HER!
        System.out.println("Kære spiller 1, indtast venligst dit navn og tryk 'enter'.");
        spiller1 = scan.nextLine();

        System.out.println("Kære spiller 2, indtast venligst dit navn og tryk 'enter'.");
        spiller2 = scan.nextLine();

        System.out.println("\n" + "Tryk 'enter' til at kaste terningerne, når det er din tur.");

        resultatSpiller1 = 0;
        resultatSpiller2 = 0; // SÆTTER STARTANTALLET AF POINTS

        while(resultatSpiller1 < maksPoints && resultatSpiller2 < maksPoints) {

           // SPILLER 1 KASTER TERNINGER
                System.out.println("\n" + spiller1.toString() + ", det er din tur.");
                scan.nextLine();

                // GENERERER TILFÆLDIGE TAL OG GEMME VÆRDIEN I VARIABLERNE

            rafflebær.kast();
            System.out.println("Du fik: " + rafflebær.point());
            resultatSpiller1 +=  rafflebær.point(); // LÆGGER VÆRDI AF TERNINGER SAMMEN OG TILFØJER POINTS TIL SPILLEREN

            System.out.println(spiller1.toString() + ", din point er: " + resultatSpiller1 );

                // Hvis spilleren 1 opnår 40 point
                if (resultatSpiller1 >= maksPoints){
                System.out.println(spiller1.toString() + ", du har opnået maks point. nu skal du slå to ens for at vinde spillet!");

            }


            if(resultatSpiller1 < maksPoints){ // SPILLER 2 KASTER TERNINGER SÅ LÆNGE SPILLER 1 IKKE HAR VUNDET
                System.out.println("\n" + spiller2.toString() + ", det er din tur.");
                scan.nextLine();

                // GENERERER TILFÆLDIGE TAL OG GEMME VÆRDIEN I VARIABLERNE


                rafflebær.kast();
                System.out.println("Du fik: " + rafflebær.point());
                resultatSpiller2 +=  rafflebær.point();; // LÆGGER VÆRDI AF TERNINGER SAMMEN OG TILFØJER POINTS TIL SPILLEREN

                System.out.println(spiller2.toString() + ", din point er:  " + resultatSpiller2 );
            }
            if (resultatSpiller2 >= maksPoints){
                System.out.println(spiller2.toString() + ", du har opnået maks point. nu skal du slå to ens for at vinde spillet!");

            }
        }
    }
}