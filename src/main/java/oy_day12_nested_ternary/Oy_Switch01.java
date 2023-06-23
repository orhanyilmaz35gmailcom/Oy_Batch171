package oy_day12_nested_ternary;

import java.util.Scanner;

public class Oy_Switch01 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen gün ismini yaziniz");
        String gunIsmi = scan.nextLine();

       if (gunIsmi.equalsIgnoreCase("pazartesi")) {
            System.out.print(1);
        } else if (gunIsmi.equalsIgnoreCase("sali")) {
            System.out.print(2);

        } else if (gunIsmi.equalsIgnoreCase("carsamba")) {
            System.out.print(3);

        } else if (gunIsmi.equalsIgnoreCase("persembe")) {
            System.out.print(4);

        } else if (gunIsmi.equalsIgnoreCase("cuma")) {
            System.out.print(5);

        } else if (gunIsmi.equalsIgnoreCase("cumartesi")) {
            System.out.print(6);

        }else if (gunIsmi.equalsIgnoreCase("pazar")) {
            System.out.print(7);

        }else{
        System.out.print("lutfen dogru bilgi giriniz ");}
// hhhhghjjjjl

        switch (gunIsmi.toLowerCase()) {
            case "pazartesi":
                System.out.print(1);
                break;
            case "sali":
                System.out.print(2);
                break;
            case "carsamba":
                System.out.print(3);
                break;
            case "persembe":
                System.out.print(4);
                break;
            case "cuma":
                System.out.print(5);
                break;
            case "cumartesi":
                System.out.print(6);
                break;
            case "pazar":
                System.out.print(7);
                break;
            default:
                System.out.print(" dogru bilgi girsene ");



        }




        }
    }
