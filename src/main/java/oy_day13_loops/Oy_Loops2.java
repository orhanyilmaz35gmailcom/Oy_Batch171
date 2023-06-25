package oy_day13_loops;

public class Oy_Loops2 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 5; i < 9; i++) {
            sum = sum + i;


        }
        System.out.println(sum);

        int multplay = 1;
        for (int i = 7; i < 10; i++) {
            multplay = multplay * i;

        }
        System.out.println(multplay);


        int rak = 0;


        for (int i = 578; i > 0; i = i / 10) {

            rak = rak + i % 10;

        }
        System.out.println(rak);


    }
}
