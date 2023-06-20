package day05concatinationoperatorstypecasting;

public class Oy_Concatination {
    public static void main(String[] args) {

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);
        System.out.println(s +( a + b));
        System.out.println(s + a * b);
        System.out.println(a + b + s  );
        System.out.println(a + s + b);



        String shirt = "2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);


        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);


        String tv = "$1100";
        String radio="$300";
        System.out.println(tv+radio);

        int totalPrice =  Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

    }

}