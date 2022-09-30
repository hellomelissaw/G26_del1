package Spil;

public class Spiller {

    private int totalPoint;

    public int setPoint(int antalPoint) {
        totalPoint += antalPoint;
        return totalPoint;
    }

    public int getTotalPoint() {
        return totalPoint;
    }

}
