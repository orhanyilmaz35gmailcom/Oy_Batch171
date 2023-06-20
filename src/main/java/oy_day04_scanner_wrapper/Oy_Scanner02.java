package oy_day04_scanner_wrapper;

import java.util.Scanner;

public class Oy_Scanner02 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz..");


        String adress = input.nextLine();

        System.out.println(adress);

    }

}