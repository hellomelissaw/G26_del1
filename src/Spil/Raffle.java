package Spil;

public class Raffle {
    Terning terning1 = new Terning();
    Terning terning2 = new Terning();


    public int getSum (){ // henter værdien af hver de to terninger og lægger dem sammen
        int t1 = terning1.kast();
        int t2 = terning2.kast();
        System.out.println("Første terning: " + t1 + " og anden terning: " + t2);
        int sum ;
        sum = t1+t2;
        return sum;
    }

}
