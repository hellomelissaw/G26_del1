package Spil;

public class Raffle {
    Terning terning1 = new Terning();
    Terning terning2 = new Terning();
    int t1 = terning1.kast();
    int t2 = terning2.kast();
   private int sum ; // initialiserer variable, som gemmer summen af de to terninger


    public int getSum (){ // henter værdien af hver de to terninger og lægger dem sammen

        int sum ;
        sum = t1+t2;
        return sum;
    }

    public void printSum () {
        System.out.println("Første terning: " + t1 + " Anden terning: " + t2);
    }
}
