package Spil;

public class Raffle {



    private Terning terning1 , terning2 ;
    public Raffle(){
         terning1 = new Terning();
         terning2 = new Terning();
    }

    public void kast(){
        terning1.kast();
        terning2.kast();
    }
    public  int point(){

        int point = terning1.hentResultatKast() + terning2.hentResultatKast();
        return point;
    }
}
