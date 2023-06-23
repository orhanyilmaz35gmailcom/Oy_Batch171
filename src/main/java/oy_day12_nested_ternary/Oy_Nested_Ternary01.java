package oy_day12_nested_ternary;

public class Oy_Nested_Ternary01 {
    public static void main(String[] args) {




      int year=1979;

                   //   c ?        (     c      ?      t       :      f      ) :  (   c      ?     t  :      f    );
   String sonuc =  year%100==0 ? (year%400==0 ? " leap year" :  "not leap ") :  (year%4==0 ? "leap" : "not leap");

        System.out.println(sonuc);


    }
}
