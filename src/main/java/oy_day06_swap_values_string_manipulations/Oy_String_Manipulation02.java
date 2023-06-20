package oy_day06_swap_values_string_manipulations;

public class Oy_String_Manipulation02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);


        String s1 = s.replace("money", "dollar");
        System.out.println(s1);


        String s2 = s.replace("earn", "win");
        System.out.println(s2);


        String s3 = s.replace('a', '*');
        System.out.println(s3);

        String s4 = s.replace("n", "xxx");
        System.out.println(s4);

        String s5 = s.replace("e", "");
        System.out.println(s5);

        String t = "Ali 13 yasindadir!...";

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

    }
}