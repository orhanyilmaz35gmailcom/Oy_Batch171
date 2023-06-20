package oy_day04_scanner_wrapper;

import java.util.Scanner;

public class Oy_Scanner05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
        int number = input.nextInt();


        int birlerBasamagi = number % 10;

        number = number / 10;

        int sondanIkinci = number % 10;

        number = number / 10;

        int sondanUcuncu = number % 10;

        number = number / 10;

        int sondanDorduncu = number % 10;


        int sondanBesinci = number % 10;


        System.out.println(sondanBesinci + sondanDorduncu + birlerBasamagi + sondanIkinci);

    }
}