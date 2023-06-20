package day04scannerwrapper;

public class Oy_Wrapper_Class {
    public static void main(String[] args) {

        int n = 12;

        Integer m = 12;

        byte p = 33;
        Byte r = 44;


        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);


        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(intMin+byteMax);


        int num = 19;
        Integer wrapperNum = num;


        Byte k = 19;
        byte primitiveK = k;


        char initial = 'T';
        Character initialWrapper = initial;


        Boolean isOldWrapper =true;
        boolean isOld = isOldWrapper;


    }
}