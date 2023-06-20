package oy_day03_method_object_creation_scanner;



import java.util.Scanner;

public class Oy_Scanner01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Lutfen yasinizi giriniz");


        byte age = input.nextByte();

        System.out.println("age = " + age);

    }


}