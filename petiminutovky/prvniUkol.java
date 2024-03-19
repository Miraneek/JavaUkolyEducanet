package petiminutovky;

import java.util.Arrays;

public class prvniUkol {
    public static void main(String[] args) {

        //malaNasobilka();

        //Ukol 2
        /*
        int[] array = { 10,5,1,3,7,9,2,6,8,4 };
        System.out.println(getMedian(array));
        */


        //Ukol 3
        //BumPrask(10);



    }

    public static void malaNasobilka() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static int getMedian(int[] array) {
        Arrays.sort(array);

        return array.length % 2 == 0 ? (array[array.length / 2] + array[array.length / 2 - 1]) / 2 : array[array.length / 2];
    }

    public static void BumPrask(int pocet){
        for (int i = 0; i < pocet; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                System.out.println("BUM");
            }
            if (i % 5 == 0 || String.valueOf(i).contains("5")) {
                System.out.println("PRÁSK");
            }
        }
    }

}
