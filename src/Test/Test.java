package Test;

import Spil.Terning;

public class Test {


    public static void main(String[] args) {
        int counter_t1_1 , counter_t1_2 , counter_t1_3 ,counter_t1_4 ,counter_t1_5 ,counter_t1_6;
        int counter_t2_1 , counter_t2_2 , counter_t2_3 ,counter_t2_4 ,counter_t2_5 ,counter_t2_6;
        Terning terning1, terning2;
        int t1 , t2;
        terning1 = new Terning();
        terning2 = new Terning();

        t1 = terning1.kast();
        t2 = terning2.kast();

        for (int i = 1 ; i <= 1000 ; i++){
            switch (t1){
                case 1:
                    counter_t1_1 += 1 ;
                case 2:
                    counter_t1_2 += 1 ;
                case 3:
                    counter_3 += 1 ;
                case 4:
                    counter_4 += 1 ;
                case 5:
                    counter_5 += 1 ;
                case 6:
                    counter_6 += 1 ;

            }
            switch (t2){
                case 1:
                    counter_1 += 1 ;
                case 2:
                    counter_2 += 1 ;
                case 3:
                    counter_3 += 1 ;
                case 4:
                    counter_4 += 1 ;
                case 5:
                    counter_5 += 1 ;
                case 6:
                    counter_6 += 1 ;

            }
        }
    }
}
