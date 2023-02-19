package codewars.kyu_8;

public class DetermineOffspring {
    /**
     * https://www.codewars.com/kata/56530b444e831334c0000020
     */
    public static String chromosomeCheck(String sperm) {
        if (sperm.contains("Y")){
            return "Congratulations! You're going to have a son.";
        } else return "Congratulations! You're going to have a daughter.";
    }

    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XY"));
    }
}
