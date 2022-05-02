package codewars;

public class TwiceAsOld {

    //https://www.codewars.com/kata/5b853229cfde412a470000d0

    public static int twiceAsOld(int dadYears, int sonYears){
       return Math.abs(dadYears - 2 * sonYears);
    }

    public static void main(String[] args) {
        System.out.println(twiceAsOld(45,30));
    }
}
