package Spil;

public class SumTerninger {

    private int sum ; // initialiserer variable, som gemmer summen af de to terninger

    public int hentSum (int terning1 , int terning2){ // henter værdien af hver de to terninger og lægger dem sammen

        int sum ;
        sum = terning1 + terning2;
        return sum;
    }
}
