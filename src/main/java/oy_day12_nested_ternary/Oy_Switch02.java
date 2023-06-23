package oy_day12_nested_ternary;

import java.util.Scanner;

public class Oy_Switch02 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("kacinci ay oldugunu yaziniz");
        int ayNo=scan.nextInt();



         switch (ayNo) {
            case 1 :
                System.out.println("subat");
             case 2:
                 System.out.println("mart");
             case 3:
                 System.out.println("nisan");
             case 4:
                 System.out.println("mayis");
             case 5:
                 System.out.println("haziran");
             case 6:
                 System.out.println("temmuz");
             case 7:
                 System.out.println("agustos");
             case 8:
                 System.out.println("eylul");
             case 9:
                 System.out.println("ekim");
             case 10:
                 System.out.println("kasim");
             case 11:
                 System.out.println("aralik");
             case 12:
                 System.out.println("ocak");
                 break;
             default:
             System.out.println("lutfen dogru bilgi giriniz");


        }


















}
}
