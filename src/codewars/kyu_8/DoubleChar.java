package codewars.kyu_8;

public class DoubleChar {

    //https://www.codewars.com/kata/56b1f01c247c01db92000076

    public static String doubleChar(String s){
        char[] ss = s.toCharArray();
        String res = "";
        for (int i = 0; i < ss.length; i++) {
            res += String.valueOf(ss[i]).concat(String.valueOf(ss[i]));
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));

    }
}
