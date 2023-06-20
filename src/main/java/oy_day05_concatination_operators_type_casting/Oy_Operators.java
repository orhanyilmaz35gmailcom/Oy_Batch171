package day05concatinationoperatorstypecasting;

public class Oy_Operators {

    public static void main(String[] args) {
        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5>=19;
        System.out.println(first+" - "+ second + " - "+ third);//true - false - false

        System.out.println(first && second);
        System.out.println(first || second || third);
    }

}