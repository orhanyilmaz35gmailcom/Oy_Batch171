package oy_day03_method_object_creation_scanner;

public class Oy_Runner {

    public static void main(String[] args) {

//Class ismi  +  Object ismi  +  Assignment Operator +  "new" keywordu  +  Constructor
        Oy_Car myCar               =               new Oy_Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Oy_Student aliCan = new Oy_Student();


        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();


    }


}