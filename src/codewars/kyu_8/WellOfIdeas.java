package codewars.kyu_8;

import java.util.Arrays;

public class WellOfIdeas {

    //https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java

    public static String well(String[] x) {

        long countGood = Arrays.stream(x).filter(s -> s.equals("good")).count();

        if(countGood == 0) {
            return "Fail!";
        } else if (countGood < 3){
                return "Publish!";
        } else {
                return "I smell a series!";
        }
    }

    public static void main(String[] args) {
        System.out.println(well(new String[] {"good", "bad", "bad", "bad", "bad"}));
    }
}
