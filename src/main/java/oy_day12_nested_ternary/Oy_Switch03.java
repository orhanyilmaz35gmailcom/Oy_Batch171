package oy_day12_nested_ternary;

import java.util.Scanner;

public class Oy_Switch03 {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("Bitte schreiben Sie den Namen des Landes... ");
        String landName= scan.nextLine();

        switch (landName.toLowerCase()){
            case "america" :
                System.out.println("US");
                break;
            case "turkey" :
                System.out.println("TR");
                break;
            case "germany" :
                System.out.println("DE");
                break;
            case "england" :
                System.out.println("UK");
                break;
                default:
            System.out.print("Bu ülke tanimli degil");


    }
}}
