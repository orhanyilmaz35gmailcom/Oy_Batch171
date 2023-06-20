package oy_day02_data_mypes_method_creation;

public class Oy_Method_Creation01 {


    public static void main(String[] args) {
        int sonuc = toplamaYap(3, 5);
        System.out.println(sonuc);

        long carpmaSonucu =  multiply(4,5);
        System.out.println(carpmaSonucu);

        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

    }


    public static int toplamaYap(int a, int b) {
        return a + b;

    }

    protected static long multiply(int a, int b) {
        return a * b;
    }

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;
    }




}