package oy_day07_string_manipulations;

public class Oy_String_Manipulations01 {
    public static void main(String[] args) {


        String t = "Ali 13 yasindadir!...";

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);
        String t6 = t.replaceAll("[^ ]", "?");
        System.out.println(t6);


        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);

    }
}