package oy_day08_stringmanipulation_memory_usage_if_statement;

public class Oy_String_Manipulation02 {
    public static void main(String[] args) {


        String a = "abcdefghei@hotmail.com";

        int startingIndex = a.indexOf('@') + 1;
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);

        System.out.println("hard coding ==>" + a.substring(4, 9));


        String h = "ali Can";
        String i = "Ali Can";
        boolean result = h.equals(i);
        System.out.println(result);

        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");

        System.out.println(s == t);
        System.out.println(s.equals(t));
        System.out.println(s == r);
        System.out.println(s.equals(r));
//___________________________________________________________________________________________________________________________


        String j = "ali Can";
        String k = "Ali Can";
        boolean result3 = j.equalsIgnoreCase(k);
        System.out.println(result3);



    }
}