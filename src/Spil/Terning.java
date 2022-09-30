package Spil;

public class Terning {

    private int resultatKast;  // GEMMER VÆRDI FOR TERNINGEN EFTER KASTET


    public int kast() {  // GENERERER ET TILFÆLDIGT INTEGER MELLEM 1 OG 6

        final int maksSider = 6 ;  // ANGIVER MAKS ANTAL AF SIDER FOR TERNINGEN
        resultatKast = (int)(Math.random() * maksSider ) + 1;
        return resultatKast;
    }

    public int getResultatKast(){ // GIVER ADGANG TIL DEN PRIVATE resultatKast UDEN FOR KLASSET

        return resultatKast;
    }

    public String toString() {

        String kastString = Integer.toString(resultatKast);
        return kastString;
    }

}
