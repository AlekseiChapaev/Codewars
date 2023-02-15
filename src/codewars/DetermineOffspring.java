package codewars;

public class DetermineOffspring {
    public static String chromosomeCheck(String sperm) {
        if (sperm.contains("Y")){
            return "Congratulations! You're going to have a son.";
        } else return "Congratulations! You're going to have a daughter.";
    }

    public static void main(String[] args) {
        System.out.println(chromosomeCheck("XY"));
    }
}
