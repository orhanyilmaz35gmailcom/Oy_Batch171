package oy_day04_scanner_wrapper;

import java.util.Scanner;

public class Oy_Scanner03 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz");


        double firstNumber = input.nextDouble();

        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);
        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);
        System.out.println(firstNumber / secondNumber);



    }
}