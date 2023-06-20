package oy_day04_scanner_wrapper;


import java.util.Scanner;

public class Oy_Scanner01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Ilk isminizi giriniz..");

        String firstName = input.next();

        System.out.println("Soy isiminizi giriniz..");
        String lastName = input.next();

        System.out.println(firstName+" "+lastName);//ali can


    }
}