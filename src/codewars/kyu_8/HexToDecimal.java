package codewars.kyu_8;

public class HexToDecimal {

    //https://www.codewars.com/kata/57a4d500e298a7952100035d/train/java

    public static int hexToDec(final String hexString) {

        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        System.out.println(hexToDec("FF"));
    }
}