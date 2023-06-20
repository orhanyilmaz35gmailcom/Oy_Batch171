package oy_day04_scanner_wrapper;

import java.util.Scanner;

public class Oy_Scanner04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz..");
        double shortSide = input.nextDouble();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz..");
        double longSide = input.nextDouble();

        System.out.println("Alan = "+(shortSide*longSide));

        System.out.println("Cevre = "+(2*shortSide+2*longSide));






    }
}