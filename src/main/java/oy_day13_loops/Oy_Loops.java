package oy_day13_loops;

public class Oy_Loops {
    public static void main(String[] args) {


/*String t= "Germany";

        for (int i = t.length()-1; i >= 0 ; i--) {
            if (t.charAt(i)=='a') {
                break;
            }
            System.out.print(t.charAt(i));

        }
        Scanner input =new Scanner(System.in);
        System.out.println("baslangic degerini giriniz");
        int bas= input.nextInt();

        System.out.println("bitis degerini giriniz");
        int bit= input.nextInt();
if (bas>bit) {
    System.out.println("bas.bit den kucuk olmali");
}else{
        for (int i = bas ; i<=bit ; i++) {
            System.out.println( i + " ");

        }


}


        Scanner scan = new Scanner(System.in);
        System.out.println("baslangic degerini girin");
        int basla=scan.nextInt();
        System.out.println("bitis degerini girin");
        int bitir=scan.nextInt();

if (basla>bitir){
    System.out.println("baslangic buyuk olmaz ki");

}else{
        for (int i = basla; i < bitir; i++) {
            if (i%2==0){
                System.out.println(i+ " ");
            }

        }*/

        String ja="Pwd12?Ab";



        for (int i = 0; i <ja.length() ; i++) {
            char oy =ja.charAt(i);
            if (oy>='a' && oy<='z'){
                continue;

            }else {
                System.out.print(oy);

            }

        }






    }
}
