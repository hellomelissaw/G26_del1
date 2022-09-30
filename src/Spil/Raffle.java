package Spil;

public class Raffle {
    public int getTerning1() {
        return terning1;
    }

    public void setTerning1(int terning1) {
        this.terning1 = terning1;
    }

    public int getTerning2() {
        return terning2;
    }

    public void setTerning2(int terning2) {
        this.terning2 = terning2;
    }

    private int terning1 , terning2 ;

    public int raffle(Terning terning1 , Terning terning2){
        int point = terning1.kast() + terning2.kast();
        return point;
    }
}
