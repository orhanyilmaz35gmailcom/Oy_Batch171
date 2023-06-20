package oy_day08_stringmanipulation_memory_usage_if_statement;

public class Oy_String_Manipulation01 {
    public static void main(String[] args) {

        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu? " + result1);


        boolean result2 = str.isEmpty();
        System.out.println("is Empty ? " + result2);


        String t = "";

        boolean result3 = t.replace(" ", "").length() == 0;
        System.out.println(result3);


        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);


        boolean result5 = t.isBlank();
        System.out.println(result5);

        String r = "Java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);

        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println(idxA + idxE + idxI);

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3


        int idxjava = u.indexOf("java");
        System.out.println(idxjava);//-1


        String v = "Java is easy to learn";

        int idxOfa=v.lastIndexOf('a');
        System.out.println(idxOfa);//18

        int idxOfe=v.lastIndexOf('e');
        System.out.println(idxOfe);

        int idxOfi=v.lastIndexOf('i');
        System.out.println(idxOfi);

        System.out.println(idxOfa+idxOfe+idxOfi);



    }
}