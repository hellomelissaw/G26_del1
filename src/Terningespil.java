import java.util.Scanner;
import Spil.*;

public class Terningespil {

    public static void main(String[] args)
    {

        // INITIALISERER OBJEKTER OG VARIABLER
        Terning terning1, terning2;
        SumTerninger sumSpiller1, sumSpiller2;
        String spiller1, spiller2;
        //int resultat;
        int resultatSpiller1, resultatSpiller2;
        int t1 , t2;
        int vinder=0;

        final int maksPoints = 40; // ANGIVER ANTALLET AF POINTS FØR EN SPILLER VINDER

        // SKABER NYE OBJEKTER
        terning1 = new Terning();
        terning2 = new Terning();

        sumSpiller1 = new SumTerninger();
        sumSpiller2 = new SumTerninger();

        Scanner scan = new Scanner(System.in);

        //SPILLET STARTER HER!
        System.out.println("Kære spiller 1, indtast venligst deres navn og tryk 'enter'.");
        spiller1 = scan.nextLine();

        System.out.println("Kære spiller 2, indtast venligst deres navn og tryk 'enter'.");
        spiller2 = scan.nextLine();

        System.out.println("\n" + "Tryk 'enter' for at kaste terningerne, når det er din tur.");

        resultatSpiller1 = 0; resultatSpiller2 = 0; // SÆTTER STARTANTALLET AF POINTS

        int token1=1;
        int token2=1;

        while (vinder==0)
        {

            if(token1==1)
            {
                // SPILLER 1 KASTER TERNINGER
                System.out.println("\n" + spiller1 + ", det er deres tur.");
                scan.nextLine();

                // GENERERER TILFÆLDIGE TAL OG GEMME VÆRDIEN I VARIABLERNE
                t1 = terning1.kast();
                t2 = terning2.kast();

                System.out.println("Første terning: " + terning1 + " og anden terning: " + terning2);

                resultatSpiller1 += sumSpiller1.hentSum(t1, t2); // LÆGGER VÆRDI AF TERNINGER SAMMEN OG TILFØJER POINTS TIL SPILLEREN

                System.out.println(spiller1 + ", de har nu " + resultatSpiller1 + " points.");
            }

            if (token2==1)
            {
                // SPILLER 2 KASTER TERNINGER
                System.out.println("\n" + spiller2 + ", det er deres tur.");
                scan.nextLine();

                // GENERERER TILFÆLDIGE TAL OG GEMME VÆRDIEN I VARIABLERNE
                t1 = terning1.kast();
                t2 = terning2.kast();

                System.out.println("Første terning: " + terning1 + " og anden terning: " + terning2);

                resultatSpiller2 += sumSpiller2.hentSum(t1, t2); // LÆGGER VÆRDI AF TERNINGER SAMMEN OG TILFØJER POINTS TIL SPILLEREN

                System.out.println(spiller2 + ", de har nu " + resultatSpiller2 + " points.\n");
            }


            // Hvis spiller 1 opnår 40 point
            if (resultatSpiller1 >= maksPoints)
            {
                token1=0;
                System.out.println(spiller1 + ", du har opnået maks point. nu skal du slå to ens for at vinde spillet!");
                System.out.println("\n" + spiller1 + ", det er deres tur.");
                scan.nextLine();

                t1 = terning1.kast();
                t2 = terning2.kast();

                System.out.println(" Første terning: " + terning1 + " og anden terning: " + terning2);

                if (t1 == 1 && t2 == 1)
                {
                    resultatSpiller1 = 0;
                    System.out.println("Du har nu nul point, da du har slået to 1'ere");
                    token1=1;
                }
                else if (t1 == t2)
                {
                    System.out.println("Du har vundet");
                    vinder=1;
                }
            }

            if (vinder==1)
            {
                break;
            }

            // Hvis spiller 2 opnår 40 point
            if (resultatSpiller2 >= maksPoints)
            {
                token2=0;
                System.out.println(spiller2 + ",  du har opnået maks points nu skal du slå to ens for at vinde spillet!");
                System.out.println("\n" + spiller2 + ", det er deres tur.");
                scan.nextLine();

                t1 = terning1.kast();
                t2 = terning2.kast();

                System.out.println(" Første terning: " + terning1 + " og anden terning: " + terning2);

                if (t1 == 1 && t2 == 1)
                {
                    resultatSpiller1 = 0;
                    System.out.println("Du har nu nul point, da du har slået to 1'ere");
                    token2=1;
                }
                else if (t1 == t2)
                {
                    System.out.println("Du har vundet");
                    vinder=1;
                }
            }

            if (vinder==1)
            {
                break;
            }
        }
    }
}