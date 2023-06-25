package oy_day13_loops;

public class Oy_Loop1 {
    public static void main(String[] args) {

      /*  String kelime = "orhan";

        String ters="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
           ters=ters+kelime.charAt(i);

        }
        System.out.println(ters);

*/
        String polindrom="ey edip adanada pid ye";
        String tersi="";
        for (int i = polindrom.length()-1; i >=0 ; i--) {

            tersi=tersi+polindrom.charAt(i);}

            if (polindrom.equalsIgnoreCase(tersi)){
                System.out.println("polindrom");
            }else {
                System.out.println("degil");
            }







        }





    }



