package oy_day07_string_manipulations;

import java.util.Scanner;

public class Oy_String_Manipulations02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");
        String pwd = input.nextLine();


        boolean first = pwd.length() > 7;
        System.out.println(" first  " + first);

        boolean second = !pwd.contains(" ");
        System.out.println("second = " + second);


        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("third = " + third);


        boolean fourth = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("fourth = " + fourth);


        boolean fifth = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("fifth = " + fifth);

        System.out.println(("Password gecerli mi?  "+(first && second && third && fourth && fifth)));


    }
}