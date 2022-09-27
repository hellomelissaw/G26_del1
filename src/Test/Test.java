package Test;

import Spil.Terning;

public class Test {


    public static void main(String[] args) {

        int counter_t1_1 = 0 , counter_t1_2 = 0 , counter_t1_3 = 0 ,counter_t1_4 = 0 ,counter_t1_5 = 0 ,counter_t1_6 = 0;
        int counter_t2_1 = 0 , counter_t2_2 = 0 , counter_t2_3  = 0 ,counter_t2_4 = 0,counter_t2_5 = 0 ,counter_t2_6 = 0;
        int count_1 = 0 ,count_2 = 0 ,count_3 = 0 ,count_4 = 0 ,count_5 = 0 ,count_6 = 0 ;


        Terning terning1, terning2;
        int t1 , t2;

        terning1 = new Terning();
        terning2 = new Terning();


        for (int j = 1 ; j < 2 ; j++){
        for (int i = 1 ; i <= 1000 ; i++) {

            t1 = terning1.kast();

            switch (t1) {
                case 1:
                    counter_t1_1 += 1;
                    break;
                case 2:
                    counter_t1_2 += 1;
                    break;
                case 3:
                    counter_t1_3 += 1;
                    break;
                case 4:
                    counter_t1_4 += 1;
                    break;
                case 5:
                    counter_t1_5 += 1;
                    break;
                case 6:
                    counter_t1_6 += 1;
                    break;

            }

            t2 = terning2.kast();
            switch (t2) {
                case 1:
                    counter_t2_1 += 1;
                    break;
                case 2:
                    counter_t2_2 += 1;
                    break;
                case 3:
                    counter_t2_3 += 1;
                    break;
                case 4:
                    counter_t2_4 += 1;
                    break;
                case 5:
                    counter_t2_5 += 1;
                    break;
                case 6:
                    counter_t2_6 += 1;
                    break;

            }
        }
            count_1 = counter_t1_1 + counter_t2_1;
            count_2 = counter_t1_2 + counter_t2_2;
            count_3 = counter_t1_3 + counter_t2_3;
            count_4 = counter_t1_4 + counter_t2_4;
            count_5 = counter_t1_5 + counter_t2_5;
            count_6 = counter_t1_6 + counter_t2_6;

            System.out.println("Antallet af 1'ere, 2' ere, 3'ere, 4'ere, 5'ere, 6'ere i 1000 kast er:");
            System.out.println("Antallet af 1'ere er: " + count_1);
            System.out.println("Antallet af 2'ere er: " + count_2);
            System.out.println("Antallet af 3'ere er: " + count_3);
            System.out.println("Antallet af 4'ere er: " + count_4);
            System.out.println("Antallet af 5'ere er: " + count_5);
            System.out.println("Antallet af 6'ere er: " + count_6);

            //

        }
    }
}
