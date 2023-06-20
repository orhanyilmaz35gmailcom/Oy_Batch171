package oy_day06_swap_values_string_manipulations;

public class Oy_Swap_Values {
    public static void main(String[] args) {


        int a = 12;
        int b = 5;
        int temp=0;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        temp = a;

        a=b;

        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2.Yol
        int elma=12;
        int armut=5;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);

        elma = elma + armut;
        armut = elma - armut;
        elma = elma - armut;

        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);


    }
}