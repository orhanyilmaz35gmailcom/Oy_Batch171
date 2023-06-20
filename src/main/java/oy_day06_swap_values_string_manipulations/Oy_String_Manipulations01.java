package oy_day06_swap_values_string_manipulations;

public class Oy_String_Manipulations01 {
    public static void main(String[] args) {

        String s = "Java is easy";
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);
        String sLower = s.toLowerCase();
        System.out.println(sLower);
        char firstChar = s.charAt(0);
        System.out.println(firstChar);
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println("" + secondChar + secondLastChar);
        int sLength = s.length();
        System.out.println(sLength);
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);


        String sub2 = s.substring(5, 7);
        System.out.println(sub2);


        String sub3 = s.substring(8, 12);
        System.out.println(sub3);


        String sub4 = s.substring(8);
        System.out.println(sub4);


        boolean isExist = s.contains("money");
        System.out.println(isExist);


        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);


        boolean isBegin=s.startsWith("i",5);
        System.out.println(isBegin);


    }
}